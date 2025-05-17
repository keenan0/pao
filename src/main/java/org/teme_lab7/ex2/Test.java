package org.teme_lab7.ex2;

/*
* 2. Scrieti un program Java care:
    a. sa gaseasca cel mai lung cuvant dintr-un fisier text;
    b. sa adauge continutul clasei curente Java in fisierul text utilizat la exercitiul anterior;
    c. sa salveze intr-un array, linie cu linie, continutul fisierului folosit la primul exercitiu.
* */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static String findLongestWord(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("ex2.txt"));

        String longest = "";

        String line;
        while((line = reader.readLine()) != null) {
            String[] tokens = line.split(" ");

            for(String word : tokens) {
                if(word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        try {
            System.out.println(findLongestWord("ex3.txt"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
