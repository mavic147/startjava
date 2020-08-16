package com.startjava.lesson_4.array;

public class ArrayMaxEvenIndexElement {
    public static void main(String[] args) {
        UserArray userInput = new UserArray();
        int[] arr = userInput.getNums();

        int max = arr[0];
        for (int i = 2; i < userInput.getLength(); i += 2) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("The largest number with even index is: " + max);
    }
}
