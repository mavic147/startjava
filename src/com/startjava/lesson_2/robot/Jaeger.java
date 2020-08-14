package com.startjava.lesson_2.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int kaijuKilled;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int kaijuKilled) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.kaijuKilled = kaijuKilled;
    }


    // public String getModelName() {
    //     return modelName;
    // }

    // public void setModelName(String modelName) {
    //     this.modelName = modelName;
    // }

    // public String getMark() {
    //     return mark;
    // }

    // public void setMark(String mark) {
    //     this.mark = mark;
    // }

    // public String getOrigin() {
    //     return origin;
    // }

    // public void setOrigin(String origin) {
    //     this.origin = origin;
    // }

    // public float getHeight() {
    //     return height;
    // }

    // public void setHeight(float height) {
    //     this.height = height;
    // }

    // public float getWeight() {
    //     return weight;
    // }

    // public void setWeight(float weight) {
    //     this.weight = weight;
    // }

    // public int getKaijuKilled() {
    //     return kaijuKilled;
    // }

    // public void setKaijuKilled(int kaijuKilled) {
    //     this.kaijuKilled = kaijuKilled;
    // }


    public void printInfo() {
        System.out.println(this.modelName + "'s marks is: " + this.mark);
        System.out.println(this.modelName + "'s origin is: " + this.origin);
        System.out.println(this.modelName + "'s height is: " + this.height);
        System.out.println(this.modelName + "'s weight is: " + this.weight);
        System.out.println("Amount of Kaiju, killed by the jaeger: " + this.kaijuKilled);
    }


    public void plasmaCannonShoot() {
        System.out.println("Your cannon has hit 1 Kaiju!");
    }

    public void chainswordStab() {
        System.out.println("You've stabbed your enemy, continue fighting!");
    }

    public void teslaFistHit() {
        System.out.println("2 Kaiju have suffered from your fist!");
    }

    public boolean selfKill() {
        System.out.println("This was an act of bravery. Your deed will never be forgotten...");
        return true;
    }
}
