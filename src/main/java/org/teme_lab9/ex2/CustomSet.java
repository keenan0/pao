package org.teme_lab9.ex2;

/*
2. Creaţi o clasǎ care moşteneşte HashSet<Integer>.
a. Definiţi în aceastǎ clasǎ o variabilǎ membru care reţine numǎrul total de elemente adǎugate. Pentru a contoriza acest lucru,
suprascrieți metodele add şi addAll. Pentru adǎugarea efectivǎ a elementelor, folosiţi implementǎrile din clasa pǎrinte (HashSet).

b. Testaţi folosind atât add cât şi addAll. Ce observaţi? Corectaţi dacǎ este cazul.

c. Modificaţi implementarea astfel încât clasa voastrǎ sǎ moşteneascǎ LinkedList<Integer>. Ce observaţi? Ce concluzii trageţi?
 */

import java.util.*;

public class CustomSet extends HashSet<Integer> {
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
