package com.startjava.lesson2.wolf;

public class Wolf {

    private String gender = "male";
    private String name;
    private int weight = 60;
    private int age = 6;
    private String colour = "grey";



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age!");
        }
        else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    public void move() {
        System.out.println("You've covered 12km distance");
    }

    public void sit() {
        System.out.println("You sit when you're tired");
    }

    public boolean run() {
        System.out.println("You've reached your prey");
        return true;
    }

    public void howl() {
        System.out.println("You're calling your mates");
    }

    public boolean hunt() {
        System.out.println("You've killed 5 hares");
        return true;
    }
}
