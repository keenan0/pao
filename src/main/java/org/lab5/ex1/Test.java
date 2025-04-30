package org.lab5.ex1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Task tasks[] = new Task[]{new OutTask("Test"), new CounterOutTask(), new RandomOutTask()};

        Random random = new Random();
        int index = random.nextInt(tasks.length);
        tasks[index].run();
    }
}
