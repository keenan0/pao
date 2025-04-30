package org.lab5.ex2;

import org.lab5.ex1.CounterOutTask;
import org.lab5.ex1.OutTask;
import org.lab5.ex1.RandomOutTask;
import org.lab5.ex1.Task;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//
//        stack.push(new OutTask("Saut"));
//        stack.push(new CounterOutTask());
//        stack.push(new RandomOutTask());
//
//        stack.pop();
//
//        System.out.println(stack.empty());
//
//        stack.pop();
//        Task op = stack.pop();
//
//        System.out.println(stack.empty());
//        System.out.println(op);

        Queue q = new Queue();
        q.push(new OutTask("Sau"));
        q.push(new OutTask("Sault"));
        q.push(new OutTask("S2ault"));

        q.print();

        q.pop();
        q.pop();

        q.print();
    }
}
