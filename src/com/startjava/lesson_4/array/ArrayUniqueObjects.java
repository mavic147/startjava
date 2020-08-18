//вывести на экран уникальные элементы массива
package com.startjava.lesson_4.array;

public class ArrayUniqueObjects {
    public static void main(String[] args) {
        UserArray input = new UserArray();
        int[] arr = input.getNums();
        int[] buff = new int[input.getLength()];

        for (int i = 0; i < input.getLength(); i++) {
            int count = 0;
            for (int j = 0; j < input.getLength(); j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    buff[i] = count;
                }
            }
        }

        System.out.print("Unique elements are: ");
        for (int i = 0; i < input.getLength(); i++) {
            if (buff[i] == 1)
                System.out.print(arr[i] + " ");
        }
    }
}
