//Вывести все элементы массива, которые меньше среднего арифметического
package com.startjava.lesson_4.array;

public class ArrayLessThanAverage {
    public static void main(String[] args) {
        UserArray userInput = new UserArray();
        int[] arr = userInput.getNums();

        float average = 0;
        for (int i = 0; i < userInput.getLength(); i++) {
            average += arr[i];
        }
        average = average/userInput.getLength();

        for (int i = 0; i < userInput.getLength(); i++) {
            if (arr[i] < average)
                System.out.println("Element, which is less than average number is: " + arr[i]);
        }
    }
}
