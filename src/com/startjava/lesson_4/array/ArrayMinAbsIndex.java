//Найти индекс минимального по модулю элемента
package com.startjava.lesson_4.array;

public class ArrayMinAbsIndex {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();

        int minNum = Math.abs(arr[0]);
        int index = 0;
        for (int i = 1; i < input.getLength(); i++) {
            if (Math.abs(arr[i]) < minNum) {
                index = i;
                minNum = Math.abs(arr[i]);
            }
        }
        System.out.println("Minimal module element index is: " + index);
    }
}
