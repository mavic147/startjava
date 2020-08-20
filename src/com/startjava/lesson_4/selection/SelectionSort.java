package com.startjava.lesson_4.selection;

import com.startjava.lesson_4.array.ArrayRandomFill;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    ArrayRandomFill input = new ArrayRandomFill();
    Scanner scanner = new Scanner(System.in);
    private final int[] arr = input.getRandomNumbers();
    private int buff;
    private int minIndex = 0;
    private int maxIndex = 0;

    public void ascSort(int[] array) {
        System.out.println("The initial array is: " + Arrays.toString(arr));
        for (int i = 0; i < input.getLength(); i++) {
            if (i == input.getLength() - 1)
                break;
            int minNum = arr[i];
            for (int j = i; j < input.getLength(); j++) {
                if (arr[j] <= minNum) {
                    minNum = arr[j];
                    minIndex = j;
                }
            }
            buff = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = buff;
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }

    public void descSort(int[] array) {
        System.out.println("The initial array is: " + Arrays.toString(arr));
        for (int i = 0; i < input.getLength(); i++) {
            if (i == input.getLength() - 1)
                break;
            int maxNum = arr[i];
            for (int j = i; j < input.getLength(); j++) {
                if (arr[j] >= maxNum) {
                    maxNum = arr[j];
                    maxIndex = j;
                }
            }
            buff = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = buff;
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }

    public void start() {
        while (true) {
            System.out.print("What kind of sort would you like? Print [ascending/descending]: ");
            String response = scanner.next();
            if (response.toLowerCase().equals("ascending")) {
                ascSort(arr);
                break;
            }
            else if (response.toLowerCase().equals("descending")) {
                descSort(arr);
                break;
            }
            else
                System.out.println("Wrong answer, try again.");
        }
    }
}
