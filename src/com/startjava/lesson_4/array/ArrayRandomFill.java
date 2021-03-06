//класс для создания массива и его инициализации случайными числами
package com.startjava.lesson_4.array;

import java.lang.Math;
import java.util.Scanner;

public class ArrayRandomFill {
    private final int length;
    private final int[] randomNumbers;

    public int getLength() {
        return length;
    }

    public int[] getRandomNumbers() {
        return randomNumbers;
    }

    Scanner scan = new Scanner(System.in);
    public ArrayRandomFill() {
        System.out.print("Print the length of the array: ");
        length = scan.nextInt();
        randomNumbers = new int[length];
        System.out.print("Print the beginning of a range, in which the numbers will be generated: ");
        int begin = scan.nextInt();
        System.out.print("Print the end of the range: ");
        int end = scan.nextInt();

        for (int i = 0; i < length; i++) {
            randomNumbers[i] = (int) (Math.random() * ((end + 1) - begin) + begin);
        }
    }
}
