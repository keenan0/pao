package org.ex2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Verde", 4.2f, 2);
        Circle circle = new Circle("Albastru", 1);

        // Pentru subpunctul b + c
        System.out.println(triangle);
        System.out.println(triangle.getArea());

        System.out.println(circle);
        System.out.println(circle.getArea());

        // Subpunctul d
        System.out.println(triangle);
        System.out.println(circle);

        Triangle triangle2 = new Triangle("Rosu", 2, 4.1f);
        if(triangle.equals(triangle2)) {
            System.out.println("Sunt egale");
        }

        int n_obiecte = 10;
        String[] culori = {"Verde", "Albastru", "Rosu", "Galben", "Portocaliu"};
        ArrayList<Form> forms = new ArrayList<>();

        Random rd = new Random();
        for(int i = 0; i < n_obiecte; i++) {
            Form temp = null;
            String culoare = culori[rd.nextInt(culori.length)];

            if(rd.nextFloat() < 0.5) {
                temp = new Triangle(
                        culoare,
                        rd.nextFloat(10),
                        rd.nextFloat(10)
                );
            } else {
                temp = new Circle(
                        culoare,
                        rd.nextFloat(10)
                );
            }

            forms.add(temp);
        }

        for(Form form : forms) {
            System.out.println(form);
        }

        for(Form form : forms) {
            if(form instanceof Triangle) {
                ((Triangle) form).printTriangleDimensions();
            } else if(form instanceof Circle) {
                ((Circle) form).printCircleDimensions();
            }
        }

        int i = 0;
        for(Form form : forms) {
            System.out.println(i);
            if(form.getClass() == Triangle.class) {
                ((Triangle) form).printTriangleDimensions();
            } else if(form.getClass() == Circle.class) {
                ((Circle) form).printCircleDimensions();
            }
            ++i;
        }
    }
}
