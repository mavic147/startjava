package com.startjava.lesson_2.guessnumber;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {
    private final Scanner scan = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();

    private int getCompNumber() {
        System.out.println("The computer picked a number in range from 0 to 100. You have 10 attempts to guess the number.");
        return (int)(Math.random()*101);
    }

    public void prepareForNewGame() {
        player1.setPlayerAnswers();
        player2.setPlayerAnswers();
        player1.updatePlayerResult();
        player2.updatePlayerResult();
        player1.updatePlayerAttempt();
        player2.updatePlayerAttempt();
        player1.updateNextAnswer();
        player2.updateNextAnswer();
    }

    public boolean endGame() {
        String response;
        System.out.print("Would you like to continue? [Yes/No]");
        response = scan.next();
        while (true) {
            if (response.toLowerCase().equals("no")) {
                System.out.println("Game over");
                return true;
            }
            else if (response.toLowerCase().equals("yes")) {
                prepareForNewGame();
                return false;
            }
            else {
                System.out.println("Your answer is incorrect, print yes or no: ");
                response = scan.next();
            }
        }
    }

    public void attemptCount(Player player) {
        player.setPlayerAttempt();
    }

    public void whoWins(Player player) {
        player.setPlayerResult("win");
        System.out.println(player.getName() + ", you've won the game from " + player.getPlayerAttempt() + " attempts." +
                " All the numbers that you've chosen: " + Arrays.toString(player.getPlayerAnswers()));
    }

    public boolean playerTry(Player player, int compNum) {
        System.out.print(player.getName() + ", print the number: ");
        player.setPlayerNum();
        while (true) {
            if (player.getPlayerNum() == compNum) {
                player.setNextAnswer();
                attemptCount(player);
                whoWins(player);
                return true;
            }
            else if (player.getPlayerNum() < compNum) {
                player.setNextAnswer();
                attemptCount(player);
                System.out.println(player.getName() +", your number is smaller than the one picked by the computer, try again.");
            }
            else if (player.getPlayerNum() > compNum) {
                player.setNextAnswer();
                attemptCount(player);
                System.out.println(player.getName() +", your number is greater than the one picked by the computer, try again.");
            }
            return false;
        }
    }

    public void playGame() {
        int compNumber = getCompNumber();
        while (true) {
            if (playerTry(player1, compNumber) || playerTry(player2, compNumber)) {
                if (endGame()) {
                    System.out.println(player1.getName() + " " + player1.getPlayerResult());
                    System.out.println(player2.getName() + " " + player2.getPlayerResult());
                    break;
                }
                else
                    compNumber = getCompNumber();
            }
        }
    }
}

