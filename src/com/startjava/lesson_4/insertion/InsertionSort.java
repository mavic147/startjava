//сортировка вставками
package com.startjava.lesson_4.insertion;

import com.startjava.lesson_4.array.ArrayRandomFill;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayRandomFill input = new ArrayRandomFill();
        int[] arr = input.getRandomNumbers();
        int buff;

        System.out.println("The initial array is: " + Arrays.toString(arr));
        for (int i = 1; i < input.getLength(); i++) {
            for (int j = i; j > 0; j--) {
                while (arr[j] < arr[j-1]) {
                    buff = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = buff;
                }
            }
        }
        System.out.println("The final array is: " + Arrays.toString(arr));
    }
}
