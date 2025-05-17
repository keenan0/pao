package org.teme_lab5.ex1;

public class OutTask implements Task {
    private String message;

    public OutTask(String outMessage) {
        this.message = outMessage;
    }

    @Override
    public void run() {
        System.out.println(this.message);
    }

    @Override
    public String toString() {
        return "OutTask{" +
                "message='" + message + '\'' +
                '}';
    }
}
