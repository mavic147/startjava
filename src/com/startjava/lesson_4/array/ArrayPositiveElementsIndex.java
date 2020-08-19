//Вывести на экран индексы четных элементов массива
package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayPositiveElementsIndex {
    public static void main(String[] args) {
        ArrayRandomFill fill = new ArrayRandomFill();
        int[] arr = fill.getRandomNumbers();
        int countEven = 0;
        int evenIndex = 0;

        for (int element: arr) {
            if (element % 2 == 0) {
                countEven++;
            }
        }

        int[] evenArray = new int[fill.getLength() - (fill.getLength() - countEven)];
        for (int i = 0; i < fill.getLength(); i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenIndex] = i;
                evenIndex++;
            }
        }
        System.out.println("The initial array is: " + Arrays.toString(arr));
        System.out.println("The new array with even indices from the first array is: " + Arrays.toString(evenArray));
    }
}
