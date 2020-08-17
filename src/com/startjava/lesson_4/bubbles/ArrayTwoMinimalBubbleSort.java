//Найти в массиве два минимальных элемента (сортировка пузырьком)
package com.startjava.lesson_4.bubbles;

import com.startjava.lesson_4.array.UserArray;

public class ArrayTwoMinimalBubbleSort {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        while (true) {
            boolean isThereMovement = false;
            int buff;
            for (int i = 1; i < input.getLength(); i++) {
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buff;
                    isThereMovement = true;
                }
            }
            if(!isThereMovement) {
                break;
            }
        }

        System.out.print("Two minimal elements are: ");
        System.out.print(arr[0] + "," + " ");
        System.out.print(arr[1]);
    }
}
