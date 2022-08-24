package com.example;

public class FelidaeFamily extends Animal {

    String sound;

    public FelidaeFamily(int age, double weight, boolean running, boolean eating, String sound) {
        super(age, weight, running, eating);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
