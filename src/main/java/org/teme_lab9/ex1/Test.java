package org.teme_lab9.ex1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*Comparator<Integer> customComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };*/

        Comparator<Integer> customComp = (o1,o2) -> o2.compareTo(o1);

        Student s1 = new Student("Mihai", 6.3f);
        Student s2 = new Student("Maria", 9.6f);
        Student s3 = new Student("Ion", 8.5f);
        Student s4 = new Student("Daniel", 7.5f);
        Student s5 = new Student("Anion", 8.49f);

        List<Student> students = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        Catalog catalog = new Catalog(customComp);
        for(Student s : students) {
            catalog.add(s);
        }

        for(Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            Integer medie = entry.getKey();
            List<Student> studentList = entry.getValue();

            System.out.println("Media: " + medie +
                    "\nStudent List: " + studentList.toString());
        }

        for (List<Student> studenti : catalog.values()) {
            studenti.sort(Comparator.comparing(Student::getNume));
        }

        for(Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            Integer medie = entry.getKey();
            List<Student> studentList = entry.getValue();

            System.out.println("Media: " + medie +
                    "\nStudent List: " + studentList.toString());
        }
    }
}
