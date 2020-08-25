package com.startjava.lesson_2.guessnumber;
import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name;
    private int playerNum;
    private final int[] playerAnswers = new int[10];
    private int nextAnswer = 0;
    private int playerAttempt = 0;
    private String playerResult = "defeat";
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

    public void setPlayerAnswers() {
        Arrays.fill(playerAnswers,0);
    }

    public int getPlayerAttempt() {
        return playerAttempt;
    }

    public void setPlayerAttempt() {
        playerAttempt++;
    }

    public void updatePlayerAttempt() {
        playerAttempt = 0;
    }

    public String getPlayerResult() {
        return playerResult;
    }

    public void setPlayerResult(String playerResult) {
        this.playerResult = playerResult;
    }

    public void updatePlayerResult() {
        playerResult = "defeat";
    }

    public void setNextAnswer() {
        playerAnswers[nextAnswer] = getPlayerNum();
        nextAnswer++;
    }

    public void updateNextAnswer() {
        nextAnswer = 0;
    }
}
