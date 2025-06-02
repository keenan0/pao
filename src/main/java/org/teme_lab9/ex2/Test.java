package org.teme_lab9.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CustomSet set = new CustomSet();

        set.add(5); set.add(15);

        System.out.println(set.getAddedElements());
        set.addAll(Arrays.asList(89, 11, 40));
        System.out.println(set.getAddedElements());

        // Se adauga aleator in set
        System.out.println("CustomSet");
        for(Integer i : set) {
            System.out.println(i);
        }

        CustomLinkedList list = new CustomLinkedList();
        list.add(2); list.add(10);

        System.out.println(list.getAddedElements());
        list.addAll(Arrays.asList(89, 11, 40));
        System.out.println(list.getAddedElements());

        // Se pastreaza ordinea adaugarii
        System.out.println("CustomLinkedList");
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
