//программа, сдвигающая массив влево или вправо
package com.startjava.lesson_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShift {
    ArrayRandomFill rand = new ArrayRandomFill();
    Scanner scan = new Scanner(System.in);
    private int shift;
    private String response;
    private final int[] arr = rand.getRandomNumbers();
    private final int[] buff = new int[rand.getLength()];

    public int getShift() {
        return shift;
    }

    public String getResponse() {
        return response;
    }

    public void shiftLogic() {
        int index = 0;
        while (true) {
            System.out.print("Where to move? Print [left/right]: " );
            response = scan.next();
            if (response.toLowerCase().equals("left")) {
                index = shift;
                for (int i = 0; i <= shift; i++) {
                    buff[i] = arr[index];
                    if (index == rand.getLength() - 1)
                        break;
                    index++;
                }
                break;
            }
            else if (response.toLowerCase().equals("right")) {
                for (int i = shift; i < rand.getLength(); i++) {
                    buff[i] = arr[index];
                    index++;
                }
                break;
            }
            else
                System.out.println("Wrong answer, type again:");
        }

        System.out.println("The initial array is: " + Arrays.toString(arr));
        System.out.println("The final array is: " + Arrays.toString(buff));
    }

    public void performShift() {
        while (true) {
            System.out.print("How many steps should be taken? Print the amount: ");
            shift = scan.nextInt();
            if (shift == rand.getLength()) {
                System.out.println("The initial array is: " + Arrays.toString(arr));
                System.out.println("The final array is: " + Arrays.toString(buff));
                break;
            }
            else if (shift > rand.getLength()) {
                System.out.println("Error: step value is bigger than the array! Try again.");
            }
            else
                break;
        }
        shiftLogic();
    }
}
