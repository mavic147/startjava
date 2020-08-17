//найти два минимальных элемента в массиве (могут быть равны друг другу)
package com.startjava.lesson_4.array;

public class ArrayTwoMinimal {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int minNum1;
        int minNum2;
        if (arr[0] > arr[1]) {
            minNum1 = arr[1];
            minNum2 = arr[0];
        }
        else {
            minNum1 = arr[0];
            minNum2 = arr[1];
        }

        for (int i = 2; i < input.getLength(); i++) {
            if (arr[i] <= minNum1) {
                minNum2 = minNum1;
                minNum1 = arr[i];
            }
        }

        System.out.print("Two minimal elements of the array are: ");
        System.out.print(minNum1 + "," + " ");
        System.out.print(minNum2);
    }
}
