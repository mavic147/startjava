//Сжать массив, удалив из него все элементы из указанного интервала, пустые места справа заполнить нулями
package com.startjava.lesson_4.array;

import java.util.Scanner;

public class ArrayDecrease {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();
        int[] arr2 = new int[input.getLength()];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Print the beginning of the interval: ");
        int begin = scanner.nextInt();
        System.out.print("Print the end of the interval: ");
        int end = scanner.nextInt();
        int count = 0;

//        for (int i = 0; i < begin; i++) {
//            arr2[i] = arr[i];
//            count++;
//        }
//
//        for (int i = end + 1; i < input.getLength(); i++) {
//            arr2[count] = arr[i];
//            count++;
//        }

        for (int i =0; i < input.getLength(); i++) {
            if (i < begin) {
                arr2[i] = arr[i];
            }
            else if (i > end) {
                arr2[begin] = arr[end + 1];
                end++;
                begin++;
            }
        }

        System.out.print("New array is: ");
        for (int i = 0; i < input.getLength(); i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

