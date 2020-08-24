package com.startjava.lesson_2.guessnumber;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int player1Attempt = 0;
    private int player2Attempt = 0;
    private final Scanner scan = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();

    public int getPlayer1Attempt() {
        return player1Attempt;
    }

    public int getPlayer2Attempt() {
        return player2Attempt;
    }

    private int getCompNumber() {
        System.out.print("The computer picked a number in range from 0 to 100. You have 10 attempts to guess the number.");
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

    public boolean playerTry(Player player, int compNum) {
        System.out.println(player.getName() + ", print the number: ");
        player.setPlayerNum();
        while (true) {
            if (player.getPlayerNum() == compNum) {
                if (player == player1) {

                }
                else

                System.out.println(player.getName() + ", you guessed it right, congrats!");
                return true;
            }
            else if (player.getPlayerNum() < compNum) {
                System.out.println(player.getName() +", your number is smaller than the one picked by the computer, try again: ");
            }
            else if (player.getPlayerNum() > compNum) {
                System.out.println(player.getName() +", your number is greater than the one picked by the computer, try again: ");
            }
            return false;
        }
    }

    public void playGame() {
        int compNumber = getCompNumber();
        while (true) {
            if (playerTry(player1, compNumber) || playerTry(player2, compNumber)) {
                if (endGame())
                    break;
                else
                    compNumber = getCompNumber();
            }
        }
    }
}

