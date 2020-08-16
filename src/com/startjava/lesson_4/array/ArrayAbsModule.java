package com.startjava.lesson_4.array;

public class ArrayAbsModule {
    public static void main(String[] args) {
        UserArray userInput = new UserArray();
        int[] arr = userInput.getNums();

        int negativeIndex = 0;
        for (int i = 0; i < userInput.getLength(); i++) {
            if (arr[i] < 0) {
                negativeIndex = i;
                break;
            }
        }

        int modulesSum = 0;
        for (int i = negativeIndex + 1; i < userInput.getLength(); i++) {
            if (arr[i] < 0) {
                arr[i] *= -1;
            }
            modulesSum += arr[i];
        }
        System.out.println("Sum of modules after the first negative element is: " + modulesSum);
    }
}
