//реверс массива
package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayRandomFill input = new ArrayRandomFill();
        int[] arr = input.getRandomNumbers();
        int[] buff = new int[input.getLength()];
        int index = 0;

        for (int i = input.getLength() - 1; i >= 0; i--) {
            buff[index] = arr[i];
            index++;
        }

        System.out.println("The initial array is " + Arrays.toString(arr));
        System.out.println("The reversed array is: " + Arrays.toString(buff));
    }
}
