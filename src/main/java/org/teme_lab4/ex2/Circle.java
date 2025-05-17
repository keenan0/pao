package org.teme_lab4.ex2;

public class Circle extends Form {
    private float radius;

    Circle() {
        super();
        radius = 0.0f;
    }

    Circle(String color) {
        super(color);
        radius = 0.0f;
    }

    Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public void printCircleDimensions() {
        System.out.println("[Circle]");
        System.out.println("Radius: " + radius);
    }

    @Override
    public float getArea() {
        return this.radius * this.radius * (float) Math.PI;
    }

    @Override
    public String toString() {
        return "Cerc: " +
                super.toString() +
                " " + getArea();
    }
}
