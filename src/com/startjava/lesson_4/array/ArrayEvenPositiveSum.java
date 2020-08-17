//Найти сумму всех четных положительных чисел
package com.startjava.lesson_4.array;

public class ArrayEvenPositiveSum {
    public static void main(String[] args) {
        UserArray userInput = new UserArray();
        int[] arr = userInput.getNums();

        int sum = 0;
        for (int i = 0; i < userInput.getLength(); i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0)
                sum += arr[i];
        }

        System.out.println("Sum of even positive numbers is: " + sum);
    }
}

