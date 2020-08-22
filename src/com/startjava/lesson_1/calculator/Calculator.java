package com.startjava.lesson_1.calculator;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.*;

public class Calculator {
    private int var1;
    private int var2;
    private char operation;
    private String[] forExpressions = new String[3];
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
            userRespond = scan.nextLine();
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

        public void conversion() {
            var1 = Integer.parseInt(forExpressions[0]);
            var2 = Integer.parseInt(forExpressions[2]);
            operation = forExpressions[1].charAt(0);
        }

        public void init() {
            Arrays.fill(forExpressions, "");
            System.out.println("Print the 1st number, the operator and the 2nd number, for example [2 * 10]: ");
            forExpressions = scan.nextLine().split(" ");
            conversion();
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
                System.out.println(addExact(var1, var2));
                break;

            case '-':
                System.out.println(subtractExact(var1,var2));
                break;

            case '*':
                System.out.println(multiplyExact(var1,var2));
                break;

            case '/':
                System.out.println((double)floorDiv(var1,var2));
                break;

            case '%':
                if (var1 < 0)
                    System.out.println(floorMod(var1,var2));
                else
                    System.out.println(var1 % var2);
                break;

            case '^':
                System.out.println(pow(var1, var2));
//                double result = 1;
//                boolean isNegative = var2 < 0;
//                for (int i = 0; i < Math.abs(var2); i++)
//                    result *= var1;
//                if (isNegative)
//                    result = 1 / result;
//                System.out.println(result);
                break;

            default:
                System.out.println("Incorrect symbol was given");
            }
        }
}
