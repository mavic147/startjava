package com.startjava.lesson_4.array;

import java.util.Scanner;

public class UserArray {
    private final int length;
    private final int[] nums;
    
    public int getLength() {
        return length;
    }

    public int[] getNums() {
        return nums;
    }

    public UserArray() {
        System.out.print("Print the length of the array: ");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        System.out.print("Print " + length + " numbers to put in the array: ");
        nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = scan.nextInt();
        }
    }
}
