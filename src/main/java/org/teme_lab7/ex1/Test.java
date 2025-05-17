package org.teme_lab7.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            CalculatorConcret cc = new CalculatorConcret();
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");

                if(tokens[0].equals("add")) {
                    try {
                        Double x = Double.parseDouble(tokens[1]);
                        Double y = Double.parseDouble(tokens[2]);

                        System.out.println(cc.add(x, y));
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                } else if(tokens[0].equals("divide")) {
                    try {
                        Double x = Double.parseDouble(tokens[1]);
                        Double y = Double.parseDouble(tokens[2]);

                        System.out.println(cc.divide(x, y));
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                } else if(tokens[0].equals("average")) {
                    try {
                        Double[] arr = new Double[tokens.length - 1];

                        for(int i = 1; i < tokens.length; i++)
                            arr[i - 1] = Double.parseDouble(tokens[i]);

                        System.out.println(cc.average(arr));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
