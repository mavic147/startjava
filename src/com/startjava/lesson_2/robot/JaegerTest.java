package com.startjava.lesson_2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.0f, 2412.0f, 6);
        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark-3", "the USA", 79.0f, 1980.0f, 9);

        jaeger1.printInfo();
        jaeger1.teslaFistHit();
        System.out.println("");
        System.out.println("");

        jaeger2.printInfo();
        jaeger2.plasmaCannonShoot();
        jaeger2.chainswordStab();
        jaeger2.selfKill();

    }
}
