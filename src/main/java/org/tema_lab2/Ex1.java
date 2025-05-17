package org.tema_lab2;

/*
1. Implementati o aplicatie Java in care:
a) cititi de la tastatura un numar intreg n cuprins intre [0, 5].
Nota: interactiunea cu userul va continua atat timp cat acesta nu a furnizat o valoare valida.
b) creati un tablou unidimensional de lungime n, ale carui elemente intregi le cititi de la tastatura.
c) implementati o metoda care realizeaza inversarea ordinii initiale a elementelor tabloului si afisarea lui in consola.
exemplu: Input: [2, 4, 1, 5, 3]
         Output: [3, 5, 1, 4, 2]
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    private static int n;
    private static int[] arr;

    private static int[] inverseaza(int[] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }

        int len = arr.length;
        int[] inv = new int[len];
        for (int i = 0; i < len; i++)
            inv[i] = arr[len - 1 - i];

        return inv;
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();

        if(n < 0 || n > 5) {
            System.out.println("Numarul introdus nu respecta conditiile.");
            return;
        }

        arr = new int[n];
        System.out.print("Array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    private static void print(int[] arr) {
        if(arr == null || arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for(int i = 0; i < n - 1; ++i)
            System.out.print(arr[i] + " , ");
        System.out.println(arr[n - 1] + "]");
    }

    public static void main2(String[] args) {
        input();

        int[] inv = inverseaza(arr);

        print(inv);
        System.out.println(Arrays.toString(inv));
    }
}
