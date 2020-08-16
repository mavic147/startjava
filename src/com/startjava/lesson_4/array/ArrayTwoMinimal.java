package com.startjava.lesson_4.array;

public class ArrayTwoMinimal {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int minNum1 = arr[0];
        int index = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] < minNum1) {
                minNum1 = arr[i];
                index = i;
            }
        }
        arr[index] = 0;

        int minNum2 = arr[0];
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] <= minNum1 && arr[i] > 0) {
                minNum2 = arr[i];
            }
        }

        System.out.print("Two minimal elements of the array are: ");
        System.out.print(minNum1 + "," + " ");
        System.out.print(minNum2);
    }
}
