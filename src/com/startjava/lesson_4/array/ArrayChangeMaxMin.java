//Поменять местами минимальный и максимальный элементиы массива случайных чисел
package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayChangeMaxMin {
    public static void main(String[] args) {
        ArrayRandomFill input = new ArrayRandomFill();
        int[] arr = input.getRandomNumbers();

        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            else if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("The initial array is: " + Arrays.toString(arr));
        int buff = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = buff;
        System.out.println("The final array is: " + Arrays.toString(arr));
    }
}
