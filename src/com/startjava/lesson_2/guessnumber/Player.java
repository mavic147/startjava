package com.startjava.lesson_2.guessnumber;
import java.util.Scanner;

public class Player {
    private String name;
    private int playerNum;
    private int[] player1Answers = new int[10];
    private int[] player2Answers = new int[10];
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


    public int[] getPlayer1Answers() {
        return player1Answers;
    }

    public void setPlayer1Answers(int[] player1Answers) {
        this.player1Answers = player1Answers;
    }

    public int[] getPlayer2Answers() {
        return player2Answers;
    }

    public void setPlayer2Answers(int[] player2Answers) {

        this.player2Answers = player2Answers;
    }
}
