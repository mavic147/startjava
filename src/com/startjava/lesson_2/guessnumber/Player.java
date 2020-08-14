package com.startjava.lesson_2.guessnumber;
import java.util.Scanner;

public class Player {
    private String name;
    private int playerNum;
    Scanner scan = new Scanner(System.in);

    public Player() {
        setName();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Print your name: ");
        this.name = scan.next();
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum() {
        this.playerNum = scan.nextInt();
    }
}
