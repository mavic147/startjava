//Разложить положительные и отрицательные числа по разным массивам
package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayPositiveNegativeSort {
    public static void main(String[] args) {
        ArrayRandomFill input = new ArrayRandomFill();
        int[] arr = input.getRandomNumbers();
        int countPositive = 0;
        int indexPositive = 0;
        int indexNegative = 0;

        for (int element: arr) {
            if(element > 0)
                countPositive++;
        }

        int[] positiveArray = new int[input.getLength() - (input.getLength() - countPositive)];
        int[] negativeArray = new int[input.getLength() - countPositive];

        for (int element: arr) {
            if (element >= 0) {
                positiveArray[indexPositive] = element;
                indexPositive++;
                if (indexPositive == positiveArray.length)
                    break;
            }
        }

        for (int element: arr) {
            if (element < 0) {
                negativeArray[indexNegative] = element;
                indexNegative++;
                if (indexNegative == negativeArray.length)
                    break;
            }
        }
        System.out.println("The initial array is: " + Arrays.toString(arr));
        System.out.println("Array with positive elements only: " + Arrays.toString(positiveArray));
        System.out.println("Array with negative elements only: " + Arrays.toString(negativeArray));
    }
}
