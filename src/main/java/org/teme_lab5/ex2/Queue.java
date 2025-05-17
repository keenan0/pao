package org.teme_lab5.ex2;

import org.teme_lab5.ex1.Task;

import java.util.NoSuchElementException;

public class Queue implements TaskContainer {
    private int buffer_size = 2;
    private int size = 0;
    private int front = 0;
    private int rear = -1;
    private Task[] data = new Task[this.buffer_size];

    @Override
    public void push(Task t) {
        if(size == this.buffer_size) {
            Task[] newData = new Task[this.buffer_size * 2];
            for(int i = 0; i < size; ++i)
                newData[i] = this.data[(front + i) % buffer_size];
            front = 0;
            rear = size - 1;
            buffer_size *= 2;

            this.data = newData;
        }

        rear = (rear + 1) % this.buffer_size;
        data[rear] = t;
        size++;
    }

    @Override
    public Task pop() {
        if(empty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        Task temp = data[front];
        front = (front + 1) % this.buffer_size;
        size--;
        return temp;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void print() {
        System.out.println("Queue:");
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front + i) % this.buffer_size] + " , ");
        }
        System.out.println("<- Front element");
    }
}
