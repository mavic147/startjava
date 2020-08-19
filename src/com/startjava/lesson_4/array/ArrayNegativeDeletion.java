//удалить из массива все отрицательные числа
package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayNegativeDeletion {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();
        int countNegative = 0;
        int posIndex = 0;

        for (int i = 0; i < input.getLength(); i++) {
            if (arr[i] < 0) {
                countNegative++;
            }
        }

        int[] positiveElements = new int[input.getLength() - countNegative];
        for (int i = 0; i < input.getLength(); i++) {
            if (arr[i] >= 0) {
                positiveElements[posIndex] = arr[i];
                posIndex++;
            }
        }
        System.out.println("The initial array: " + Arrays.toString(arr));
        System.out.println("Array with positive elements only: " + Arrays.toString(positiveElements));
    }
}
