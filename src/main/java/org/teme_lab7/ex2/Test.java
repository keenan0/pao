package org.teme_lab7.ex2;

/*
* 2. Scrieti un program Java care:
    a. sa gaseasca cel mai lung cuvant dintr-un fisier text;
    b. sa adauge continutul clasei curente Java in fisierul text utilizat la exercitiul anterior;
    c. sa salveze intr-un array, linie cu linie, continutul fisierului folosit la primul exercitiu.
* */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Test {
    public static String findLongestWord(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String longest = "";

        String line;
        while((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\W+");

            for(String word : tokens) {
                if(word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        return longest;
    }

    public static void appendCurrentClassToFile(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\tumbr\\IdeaProjects\\tema4\\src\\main\\java\\org\\teme_lab7\\ex2\\Test.java"));
        FileWriter writer = new FileWriter(fileName, true);

        writer.write("\n\n//~~~~~~~~~~~~~~~~~\n");
        for(String line : lines) {
            writer.write(line + "\n");
        }

        writer.close();
    }

    public static String[] loadFileLines(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        return lines.toArray(new String[0]);
    }

    public static void main(String[] args) {
        try {
            System.out.println(findLongestWord("ex2.txt"));
        } catch(IOException e) {
            e.printStackTrace();
        }

        try{
            appendCurrentClassToFile("ex2.txt");
            loadFileLines("ex2.txt");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
