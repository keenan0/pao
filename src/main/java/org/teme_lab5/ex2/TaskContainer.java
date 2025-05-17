package org.teme_lab5.ex2;

import org.teme_lab5.ex1.Task;

public interface TaskContainer {
    void push(Task t);
    Task pop();
    boolean empty();

    void print();
}
