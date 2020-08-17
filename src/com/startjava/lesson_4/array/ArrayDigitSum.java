//Найти сумму всех цифр массива
package com.startjava.lesson_4.array;

import java.util.ArrayList;

public class ArrayDigitSum {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();
        String[] str = new String[input.getLength()];
//        ArrayList<Integer> list = new ArrayList<Integer>();

        int lastValue;
        int sumDigits = 0;
        for (int i = 0; i < input.getLength(); i++) {
            while (arr[i] != 0) {
                lastValue = arr[i] % 10;
                sumDigits += lastValue;
                arr[i]  /= 10;
            }
        }
        System.out.println("Sum of each element's digit is: " + sumDigits);

//        for (int i = 0; i < input.getLength(); i++) {
//            String text = String.join(",", String.valueOf(arr[i]).split(""));
//            str[i] = text;
//        }
//
//        for (int i = 0; i < input.getLength(); i++) {
//              list.add(Integer.parseInt(str[i]));
//        }
//
//        int sumDigits = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sumDigits += list.get(i);
//        }
    }
}
