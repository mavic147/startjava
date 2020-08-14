package com.startjava.lesson_1.guessgame;
import java.util.Scanner;
import java.lang.Math;

public class GuessGame {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int compNum = (int)(Math.random()*(b - a + 1)) + a;
        Scanner scan = new Scanner(System.in);
        System.out.print("The computer picked a number. Guess the number, printing it: ");
        int userNum = scan.nextInt();

        while (true) {
            if (userNum == compNum) {
                System.out.println("You guessed the number, congrats!");
                break;
            }
            else if (userNum > compNum) {
                System.out.println("Your number is greater than the one picked by the computer, try again: ");
                userNum = scan.nextInt();
            }
            else if (userNum < compNum) {
                System.out.println("Your number is smaller than the one picked by the computer, try again: ");
                userNum = scan.nextInt();
            }

        }
    }
}
