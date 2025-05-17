package org.teme_lab4.ex1;

/*
a. Creați un proiect nou cu numele Bookstore si urmatoarele clase:
- clasa Book cu următoarele atribute: title, author, publisher, pageCount.
- clasa BookstoreTest pentru a testa viitoarele funcționalități ale bibliotecii.
Completați această clasă cu metode CRUD (create, read, update, delete) pentru a simula functionalitatea.

b. Creați obiecte de tip carte și setați atributele introducând date de la tastatură.
Verificați ca numărul de pagini introdus să fie diferit de zero.

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {
    public static ArrayList<Book> read(String filename) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            String line;
            while((line = br.readLine()) != null) {
                String[] words = line.split(",");

                Book temp = new Book();
                temp.setTitle(words[0]);
                temp.setAuthor(words[1]);
                temp.setPublisher(words[2]);
                temp.setPageCount(Integer.parseInt(words[3]));

                books.add(temp);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        return books;
    }
}