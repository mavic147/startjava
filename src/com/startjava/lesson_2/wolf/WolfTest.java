package com.startjava.lesson_2.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();

        wolf1.setGender("male");
        wolf1.setName("Akela");
        wolf1.setWeight(65);
        wolf1.setAge(10);
        wolf1.setColour("grey and white");

        System.out.println("1st Object's gender is: " + wolf1.getGender());
        System.out.println("1st Object's name is: " + wolf1.getName());
        System.out.println("1st Object's weight is: " + wolf1.getWeight() + " kilo");
        System.out.println("1st Object's age is: " + wolf1.getAge() + " years");
        System.out.println("1st Object's colour is: " + wolf1.getColour());
        System.out.println("");

        wolf1.move();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
        System.out.println("");
        System.out.println("");


        wolf2.setGender("female");
        wolf2.setName("Omega");
        wolf2.setWeight(52);
        wolf2.setAge(3);
        wolf2.setColour("white and grey");

        System.out.println("2nd Object's gender is: " + wolf2.getGender());
        System.out.println("2nd Object's name is: " + wolf2.getName());
        System.out.println("2nd Object's weight is: " + wolf2.getWeight() + " kilo");
        System.out.println("2nd Object's age is: " + wolf2.getAge() + " years");
        System.out.println("2nd Object's colour is: " + wolf2.getColour());
        System.out.println("");

        wolf2.move();
        wolf2.sit();
        wolf2.run();
        wolf2.howl();
        wolf2.hunt();
    }
}
