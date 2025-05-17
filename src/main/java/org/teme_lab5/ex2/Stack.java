package org.teme_lab5.ex2;

import org.teme_lab5.ex1.Task;

import java.util.EmptyStackException;

public class Stack implements TaskContainer {
    private Task[] data;
    private int top;
    private int buffer_size;

    public Stack() {
        this.buffer_size = 2;

        this.top = -1;
        this.data = new Task[this.buffer_size];
    }

    @Override
    public void push(Task t) {
        if(top + 1 >= buffer_size) {
            Task[] temp = new Task[buffer_size * 2];

            System.arraycopy(data, 0, temp, 0, buffer_size);

            data = temp;
            buffer_size *= 2;
        }

        data[++top] = t;
    }

    @Override
    public void print() {
        System.out.println("Stack:");
        for(int i = 0; i <= top; i++)
            System.out.print(data[i] + " , ");
        System.out.println(" <- Top element");
    }

    @Override
    public Task pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }

        return data[top--];
    }

    @Override
    public boolean empty() {
        return (top == -1);
    }
}
