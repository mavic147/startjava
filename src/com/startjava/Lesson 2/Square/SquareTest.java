package com.startjava.lesson2.square;

public class SquareTest {
    public static void main(String[] args) {
        //Square sq = new Square();
        // sq.setSide(5);

        // System.out.println("Периметр квадрата равен: " + sq.countPerimiter(sq.getSide()));
        // System.out.println("Площадь квадрата равна: " + sq.countArea(sq.getSide()));

        Square sq = new Square(5);
        System.out.println("Square perimiter is: " + sq.countPerimiter());
        System.out.println("Square area is: " + sq.countArea());
    }
}
