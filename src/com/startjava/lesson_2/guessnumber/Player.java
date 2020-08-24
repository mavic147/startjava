package com.startjava.lesson_2.guessnumber;
import java.util.Scanner;

public class Player {
    private String name;
    private int playerNum;
    private final int[] playerAnswers = new int[10];
    private int nextAnswer = 0;
    Scanner scan = new Scanner(System.in);

    public Player() {
        setName();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Print your name: ");
        this.name = scan.next();
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum() {
        this.playerNum = scan.nextInt();
    }

    public int[] getPlayerAnswers() {
        return playerAnswers;
    }

    public void setNextAnswer() {
        playerAnswers[nextAnswer] = getPlayerNum();
        nextAnswer++;
    }
}
