package org.teme_lab4.ex2;

public class Form {
    private String color;

    Form() {
        color = "unknown";
    }

    Form(String color) {
        this.color = color;
    }

    public float getArea() {return 0.0f;}

    @Override
    public String toString() {
        return color;
    }
}
