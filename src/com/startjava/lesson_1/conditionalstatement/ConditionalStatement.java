package com.startjava.lesson_1.conditionalstatement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        String gender1 = "man";
        Scanner scan = new Scanner(System.in);

        System.out.print("Print your age: ");
        int age = scan.nextInt();
        if(age > 20) {
            System.out.println("You're older than 20");
        }
        else if(age < 20) {
            System.out.println("You're younger than 20");
        }

        System.out.print("Print your gender: ");
        scan.nextLine();
        String gender = scan.nextLine();
        if(gender.equalsIgnoreCase(gender1)) {
            System.out.println("You're a man.");
        }
        else {
            System.out.println("You're not a man, maybe you're a woman or something in between...");
        }

        System.out.print("Print your height: ");
        Float height = scan.nextFloat();
        if(height <= 1.80) {
            System.out.println("You're not tall.");
        }
        else
            System.out.println("You're a giant!");

        System.out.print("Print your name: ");
        scan.nextLine();
        String name = scan.nextLine();
        char ch = name.charAt(0);
        if(ch == 'M') {
            System.out.println("Your name starts with 'M'.");
        }
        else if(ch == 'I') {
            System.out.println("Your name starts with 'I'.");
        }
        else
            System.out.println("Your name is strange!");
    }
}
