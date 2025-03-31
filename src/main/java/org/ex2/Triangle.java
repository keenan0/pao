package org.ex2;

public class Triangle extends Form {
    private float height;
    private float base;

    Triangle() {
        super();

        height = 0.0f;
        base = 0.0f;
    }

    Triangle(String color) {
        super(color);
        height = 0.0f;
        base = 0.0f;
    }

    Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public void printTriangleDimensions() {
        System.out.println("[Triangle]");
        System.out.println("Height: " + height);
        System.out.println("Base: " + base);
    }

    @Override
    public float getArea() {
        return this.base * this.height / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Triangle)) {return false;}

        // Nu putem verifica daca doua triunghiuri sunt egale cunoscand doar lungimea bazei si a inaltimii, asa ca vom considera ca doua triunghiuri sunt "egale" daca au aceeasi arie
        return Math.abs(this.getArea() - ((Triangle) obj).getArea()) < 0.00001f;
    }

    @Override
    public String toString() {
        return "Triunghi: " +
                super.toString() +
                " " + getArea();
    }
}
