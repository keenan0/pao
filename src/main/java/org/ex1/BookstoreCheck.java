package org.ex1;

/*
c. Creați o clasă nouă, BookstoreCheck, ce va conține două metode:
- prima metodă va verifica dacă o carte este în dublu exemplar;
- a doua metodă va verifica daca o carte este mai groasă decât alta și va returna cartea mai groasă.
Testați aceste doua metode.
 */

import java.util.ArrayList;

public class BookstoreCheck {
    public static boolean duplicate(Book toCheck, ArrayList<Book> books) {
        int count = 0;

        for(Book book : books) {
            if(book.getTitle().equals(toCheck.getTitle())) {
                count++;
            }
        }

        if(count > 1) {
            return true;
        }

        return false;
    }

    public static Book bigger(Book a, Book b) {
        if(a == null) return b;
        if(b == null) return a;

        return ((a.getPageCount() > b.getPageCount()) ? a : b);
    }
}
