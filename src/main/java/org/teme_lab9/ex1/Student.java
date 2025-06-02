package org.teme_lab9.ex1;

public class Student {
    private String nume;
    private float medie;

    Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public int getMedieRotunjita() {
        return Math.round(this.medie);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '}';
    }

    public String getNume() {
        return this.nume;
    }
}
