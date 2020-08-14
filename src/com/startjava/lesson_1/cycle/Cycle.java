package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args){

        // for (int i = 0; i < 21; i++) {
        //     System.out.println(i);
        // }

        // int i = 6;
        // while (i >= -6) {
        //     System.out.println(i);
        //     i -= 2;
        // }

        int i = 10;
        int result = 0;
        do {
            if (i % 2 > 0) {
                result += i;
            }
            i++;
        } while (i < 21);
        System.out.println(result);
    }
}
