//Вставка элемента в произвольное место массива
package com.startjava.lesson_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertElement {
    private int[] array;
    private int elementToAdd;
    private int indexToMove;
    Scanner scan = new Scanner(System.in);

    public void init() {
        System.out.print("Print the length of the array: ");
        int length = scan.nextInt();
        array = new int[length];
        System.out.print("Print " + (array.length - 1) + " elements to put in the array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print("Print the last element of the array: ");
                elementToAdd = scan.nextInt();
                System.out.print("Print the index, where the last element should be inserted, from 0 to " + (array.length - 1) + ": ");
                indexToMove = scan.nextInt();
                while (indexToMove >= array.length) {
                    System.out.print("Your index is out of bounds, it should be in range from 0 to " + (array.length - 1) + ": ");
                    indexToMove = scan.nextInt();
                }
                break;
            }
            array[i] = scan.nextInt();
        }
    }

    public void insert() {
        init();
        int[] arrayWithInsertion = new int[array.length];
        if (indexToMove > 0) {
            for (int i = 0; i < indexToMove; i++) {
                arrayWithInsertion[i] = array[i];
            }
        }
        for (int i = indexToMove + 1; i < array.length; i++) {
            arrayWithInsertion[i] = array[i - 1];
        }
        arrayWithInsertion[indexToMove] = elementToAdd;
        System.out.print("Your array is: " + Arrays.toString(arrayWithInsertion));
    }
}
