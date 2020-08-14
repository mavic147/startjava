package com.startjava.lesson_2.square;

public class Square {
    private int side;

    // public int getSide() {
    //     return side;
    // }

    // public void setSide(int side) {
    //     this.side = side;
    // }

    public Square(int side) {
        this.side = side;
    }

    public int countPerimiter() {
        return side*4;
    }

    public int countArea() {
        return side*side;
    }

}
