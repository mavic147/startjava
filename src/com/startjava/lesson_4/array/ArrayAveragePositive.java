//Найти среднее арифметическое положительных элементов массива
package com.startjava.lesson_4.array;

public class ArrayAveragePositive {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < input.getLength(); i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("Average of all positive elements is: " + sum/count);
    }
}
