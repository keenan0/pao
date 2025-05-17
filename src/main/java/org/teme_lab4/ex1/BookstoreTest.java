package org.teme_lab4.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BookstoreTest {
    private static ArrayList<Book> books;

    public static void main(String[] args) {
        books = Bookstore.read("data.in");

        Set<String> bookSet = new HashSet<>();

        Book biggestBook = null;
        for(Book book : books) {
            // Testam .duplicate()
            if(BookstoreCheck.duplicate(book, books)) {
                bookSet.add(book.getTitle());
            }

            // Testam .bigger()
            biggestBook = BookstoreCheck.bigger(biggestBook, book);
        }

        for(String s : bookSet) {
            System.out.println("Cartea " + s + " apare de mai multe ori in biblioteca.");
        }

        System.out.println("Cartea cea mai groasa este: \n" + biggestBook);
    }
}
