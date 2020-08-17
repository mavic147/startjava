//Сумма модулей всех чисел после первого отрицательного элемента
package com.startjava.lesson_4.array;

public class ArrayAbsModule {
    public static void main(String[] args) {
        UserArray userInput = new UserArray();
        int[] arr = userInput.getNums();

        int modulesSum = 0;
        boolean meetNegative = false;
        for (int i = 0; i < userInput.getLength(); i++) {
            if (!meetNegative){
                if (arr[i] < 0)
                    meetNegative = true;
                continue;
            }
            modulesSum += Math.abs(arr[i]);
        }
        System.out.println("Sum of modules after the first negative element is: " + modulesSum);
    }
}
