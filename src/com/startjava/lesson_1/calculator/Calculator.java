package com.startjava.lesson_1.calculator;

import java.util.Scanner;


public class Calculator {
    private int var1;
    private int var2;
    private char operation;
    Scanner scan = new Scanner(System.in);

        // public int getVar1() {
        //     return var1;
        // }

        // public void setVar1(int var1) {
        //     this.var1 = var1;
        // }

        // public int getVar2() {
        //     return var2;
        // }

        // public void setVar2(int var2) {
        //     this.var2 = var2;
        // }

        // public char getOperation() {
        //     return operation;
        // }

        // public void setOperation(char operation) {
        //     this.operation = operation;
        // }

        public boolean finishCount() {
            System.out.println("Would you like to continue?");
            String userRespond;
            userRespond = scan.next();
            while (true) {
                if (userRespond.toLowerCase().equals("no")) {
                    return true;
                }
                else if (userRespond.toLowerCase().equals("yes")) {
                    return false;
                }
                else {
                    System.out.println("Your answer is incorrect, print yes or no.");
                    userRespond = scan.next();
                }
            }
        }

        public void init() {
            System.out.println("Print the 1st number: ");
            var1 = scan.nextInt();
            System.out.println("Print the operator: ");
            operation = scan.next().charAt(0);
            System.out.println("Print the 2nd number: ");
            var2 = scan.nextInt();
        }

        public void start() {
            while (true) {
                figureOut();
                if (finishCount()) {
                    System.out.println("Game over");
                    break;
                }
            }
        }

        public void figureOut() {
            init();
            switch (operation) {
            case '+':
                System.out.println(var1 + var2);
                break;

            case '-':
                System.out.println(var1 - var2);
                break;

            case '*':
                System.out.println(var1*var2);
                break;

            case '/':
                System.out.println((double)var1/var2);
                break;

            case '%':
                System.out.println(var1%var2);
                break;

            case '^':
                double result = 1;
                boolean isNegative = var2 < 0;
                for (int i = 0; i < Math.abs(var2); i++)
                    result *= var1;
                if (isNegative)
                    result = 1 / result;
                System.out.println(result);
                break;

            default:
                System.out.println("Incorrect symbol was given");
            }
        }
}
