package com.example;

public class FelidaeFamily extends Animal {

    public void sound() {
        System.out.println("meowing meowing");
    }

    public FelidaeFamily(int age, double weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }
}
