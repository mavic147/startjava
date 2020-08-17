//Найти сумму всех элементов массива между максимальным и минимальным (не включительно)
package com.startjava.lesson_4.array;

public class ArraySumBetweenMinMax {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int minNum = arr[0];
        int maxNum = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
            else if (arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }

        int sum = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements between minimal and maximal is: " + sum);
    }
}
