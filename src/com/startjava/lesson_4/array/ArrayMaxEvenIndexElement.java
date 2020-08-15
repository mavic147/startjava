package com.startjava.lesson_4.array;

import java.util.Scanner;

public class ArrayMaxEvenIndexElement {
    public static void main(String[] args) {
        System.out.print("Print the length of the array: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.print("Print " + length + " numbers to put in the array: ");
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = scan.nextInt();
        }

        int max = nums[0];
        for (int i = 2; i < length; i += 2) {
            if (max < nums[i])
                max = nums[i];
        }
        System.out.println("The largest number with even index is: " + max);
    }
}
