//найти максимальный эл-т массива и его индекс
package com.startjava.lesson_4.array;

public class ArrayMaxNumber {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int maxNum = arr[0];
        int maxNegativeIndex = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxNegativeIndex = i;
            }
        }
        System.out.println("Maximum  element in the array: " + maxNum);
        System.out.println("Its index is: " + maxNegativeIndex);
    }
}
