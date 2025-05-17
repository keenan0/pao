package org.teme_lab5.ex1;

public class CounterOutTask implements Task {
    static private int counter = 0;

    @Override
    public void run() {
        counter = counter + 1;
        System.out.println("New counter: " + counter);
    }

    @Override
    public String toString() {
        return "CounterOutTask{}";
    }
}
