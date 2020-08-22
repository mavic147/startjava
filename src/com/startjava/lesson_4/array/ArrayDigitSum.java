//Найти сумму всех цифр массива
package com.startjava.lesson_4.array;

import java.util.ArrayList;

public class ArrayDigitSum {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();
        int sumDigits = 0;
        for (int el: arr){
            for(char digit: String.valueOf(el).toCharArray()){
                sumDigits += Character.getNumericValue(digit);
            }
        }

//        int lastValue;
//        for (int i = 0; i < input.getLength(); i++) {
//            while (arr[i] != 0) {
//                lastValue = arr[i] % 10;
//                sumDigits += lastValue;
//                arr[i]  /= 10;
//            }
//        }

        System.out.println("Sum of each element's digit is: " + sumDigits);

    }
}
