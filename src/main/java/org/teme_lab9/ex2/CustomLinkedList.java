package org.teme_lab9.ex2;


import java.util.*;

public class CustomLinkedList extends LinkedList<Integer> {
    private Integer addedElements = 0;

    public Integer getAddedElements() {
        return addedElements;
    }

    @Override
    public boolean add(Integer integer) {
        boolean added = super.add(integer);

        if(added) {addedElements++;}

        return added;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean changed = false;
        for(Integer integer : c) {
            boolean added = super.add(integer);
            if(added) {addedElements++; changed = true;}
        }

        return changed;
    }
}
