package com.startjava.lesson_2.guessnumber;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {
    private int player1Attempt = 0;
    private int player2Attempt = 0;
    private String player1Result = "defeat";
    private String player2Result = "defeat";
    private final Scanner scan = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();

    private int getCompNumber() {
        System.out.println("The computer picked a number in range from 0 to 100. You have 10 attempts to guess the number.");
        return (int)(Math.random()*101);
    }

    public boolean endGame() {
        String response;
        System.out.println("Would you like to continue? [Yes/No]");
        response = scan.next();
        while (true) {
            if (response.toLowerCase().equals("no")) {
                System.out.println("Game over");
                return true;
            }
            else if (response.toLowerCase().equals("yes")) {
                return false;
            }
            else {
                System.out.println("Your answer is incorrect, print yes or no: ");
                response = scan.next();
            }
        }
    }

    public void attemptCount(Player player) {
        if (player == player1 & player1Attempt <=10)
            player1Attempt++;
        else if (player == player2 & player2Attempt <=10)
            player2Attempt++;
    }

    public void whoWins(Player player) { // DRY. оптимизировать так, чтобы вывод был один общий.
        if (player == player1) {
            player1Result = "win";
            System.out.println(player.getName() + ", you've won the game from " + player1Attempt + " attempts." +
                    " All the numbers that you put: " + Arrays.toString(player.getPlayerAnswers()));
        }
        else  {
            player2Result = "win";
            System.out.println(player.getName() + ", you've won the game from " + player2Attempt + " attempts." +
                    " All the numbers that you put: " + Arrays.toString(player.getPlayerAnswers()));
        }

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
                    System.out.println(player1.getName() + " " + player1Result);
                    System.out.println(player2.getName() + " " + player2Result);
                    break;
                }
                else
                    compNumber = getCompNumber();
            }
        }
    }
}

