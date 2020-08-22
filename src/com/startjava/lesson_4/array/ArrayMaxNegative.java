//Найти максимальный отрицательный эл-т массива (вывести его и его позицию в т.ч.)
package com.startjava.lesson_4.array;

public class ArrayMaxNegative {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        double maxNegative = Double.NEGATIVE_INFINITY;

        int maxNegativeIndex = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] < 0 & arr[i] > maxNegative) {
                maxNegative = arr[i];
                maxNegativeIndex = i;
            }
        }

        if (maxNegative == Double.NEGATIVE_INFINITY)
            System.out.println("No negative numbers were added to the array.");
        else {
            System.out.println("Maximum negative element in the array: " + (int) maxNegative);
            System.out.println("Its index is: " + maxNegativeIndex);
        }
    }
}
