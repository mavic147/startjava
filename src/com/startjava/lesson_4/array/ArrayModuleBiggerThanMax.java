// B диапазоне значений от -15 до 14 включительно определить количество элементов по модулю больших, чем максимальный.
package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayModuleBiggerThanMax {
    public static void main(String[] args) {
        ArrayRandomFill input = new ArrayRandomFill();
        int[] arr = input.getRandomNumbers();

        int maxNum = arr[0];
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < input.getLength(); i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
            }
            if (arr[i] > maxNum) {
                count++;
            }
        }
        System.out.println("The biggest number in array " + Arrays.toString(arr) + " "  + "is: " + maxNum);
        System.out.println("Amount of numbers, which have bigger modules than the biggest number is: " + count);
    }
}
