//Найти максимальный отрицательный эл-т массива (вывести его и его позицию в т.ч.)
package com.startjava.lesson_4.array;

public class ArrayMaxNegative {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int maxNegative = arr[0];
        if (arr[0] > 0) {
            maxNegative *= -1;
        }

        int maxNegativeIndex = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] < 0) {
                if (arr[i] > maxNegative) {
                    maxNegative = arr[i];
                    maxNegativeIndex = i;
                }
            }
        }
        System.out.println("Maximum negative element in the array: " + maxNegative);
        System.out.println("Its index is: " + maxNegativeIndex);
    }
}
