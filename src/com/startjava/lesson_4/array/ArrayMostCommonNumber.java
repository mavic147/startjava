//Найти в массиве число, которое встречается чаще всего
package com.startjava.lesson_4.array;

public class ArrayMostCommonNumber {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();


        int[] buff = new int[input.getLength()];
        for (int i = 0; i < input.getLength(); i++) {
            int count = 0;
            for (int j = i; j < input.getLength(); j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    buff[i] = count;
                }
            }
        }

        int max = buff[0];
        int maxIndex = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (buff[i] > max) {
                max = buff[i];
                maxIndex = i;
            }
        }

        System.out.println("The most common number of the array is: " + arr[maxIndex]);
    }
}
