package org.teme_lab9.ex1;

import java.util.*;

public class Catalog extends TreeMap<Integer, List<Student>> {

    public Catalog(Comparator<Integer> comp) {
        super(comp);
    }

    public void add(Student s) {
        int medie = s.getMedieRotunjita();

        /*
        List<Student> list = this.get(medie);
        if (list == null) {
            list = new ArrayList<>();
            this.put(medie, list);
        }
        list.add(s);
        */

        if(medie < 0 || medie > 10) {
            System.out.println("Media nu este corecta!");
            return;
        }

        // Functional
        this.computeIfAbsent(medie, k -> new ArrayList<>()).add(s);
    }
}