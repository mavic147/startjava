//программа, сдвигающая массив влево или вправо
package com.startjava.lesson_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShift {
    Scanner scan = new Scanner(System.in);
    private int steps;
    private String shiftSide;
    private final int[] arr;

    public ArrayShift() {
        ArrayRandomFill rand = new ArrayRandomFill();
        arr = rand.getRandomNumbers();
        printArr();
    }

    public void printArr() {
        System.out.println(Arrays.toString(arr));
    }

    private void initParams() {
        System.out.print("How many steps should be taken? Print the amount: ");
        steps = scan.nextInt();

        System.out.print("Where to move? Print [left/right]: ");
        while (true) {
            shiftSide = scan.next().toLowerCase();
            if (shiftSide.equals("left") || shiftSide.equals("right"))
                break;
            else
                System.out.println("Wrong answer, type again:");
        }
    }

    private void shiftRight() {
        int index = arr.length - 1 - steps;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (index < 0)
                arr[i] = 0;
            else
                arr[i] = arr[index];
            index--;
        }
    }

    private void shiftLeft() {
        int index = steps;
        for (int i = 0; i < arr.length; i++) {
            if (index >= arr.length)
                arr[i] = 0;
            else
                arr[i] = arr[index];
            index++;
        }
    }

    private void shiftLogic() {
        initParams();
        if (shiftSide.equals("left"))
            shiftLeft();
        else
            shiftRight();
        printArr();
    }

    public void startMove() {
        do {
            shiftLogic();
            System.out.print("To continue print yes: ");
        } while (scan.next().equals("yes"));
    }
}
