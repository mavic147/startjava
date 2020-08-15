package com.startjava.lesson_4.array;

import java.util.Scanner;

public class ArrayEvenPositiveSum {
    public static void main(String[] args) {
        System.out.print("Print the length of the array: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.print("Print " + length + " numbers to put in the array: ");
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 0 && nums[i] > 0)
                sum += nums[i];
        }

        System.out.println("Sum of even positive numbers is: " + sum);
    }
}

