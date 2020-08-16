package com.startjava.lesson_4.array;

public class ArrayMinAbsIndex {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        for (int i = 0; i < input.getLength(); i++) {
            if (arr[i] < 0) {
                arr[i] *= -1;
            }
        }

        int minNum = arr[0];
        int index = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                index = i;
            }
        }
        System.out.println("Minimal module element index is: " + index);
    }
}
