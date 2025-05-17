package org.teme_lab5.ex1;

import java.util.Random;

public class RandomOutTask implements Task {
    private Random rand;
    private float number;

    public RandomOutTask() {
        this.rand = new Random();
        this.number = this.rand.nextFloat();
    }

    @Override
    public String toString() {
        return "RandomOutTask{" +
                "rand=" + rand +
                ", number=" + number +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Random number: " + this.number);
    }
}
