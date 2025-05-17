package org.tema_lab2;

/*
2. Implementati o aplicatie Java in care:
a) creati 2 tablouri unidimensionale de lungimi diferite, cu cate cel putin 5 elemente intregi.
b) implementati o metoda de sortare in ordine crescatoare a elementelor fiecarui tablou creat anterior.
Nota: se va folosi o implementare proprie, nu pe cea din clasa Arrays.
c) creati si afisati la consola un al treilea tablou in care veti insera in ordine crescatoare toate elementele din primele 2 tablouri.
Pentru eficienta si complexitate de timp liniara, utilizati o tehnica de implementare cu 2 pointeri (cate unul pt elementele fiecarui tablou initial).
exemplu:
   Array1 initial: [1, 7, 4, 3, 9, 1]
   Array1 sortat crescator: [1, 1, 3, 4, 7, 9]
   Array2 initial: [6, 4, 2, 8]
   Array2 sortat crescator: [2, 4, 6, 8]
   Output: [1, 1, 2, 3, 4, 4, 6, 7, 8, 9]
 */

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    private static int[] a;
    private static int[] b;

    final private static int MIN_LEN = 5;
    final private static int MAX_LEN = 10;

    final private static int MIN_X = -10;
    final private static int MAX_X = 10;

    private static Random generator = new Random();

    private static int[] alloc() {
        int randomSize = generator.nextInt(MIN_LEN, MAX_LEN + 1);
        int[] arr = new int[randomSize];
        return arr;
    }

    private static void fill(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            arr[i] = generator.nextInt(MIN_X, MAX_X + 1);
    }

    private static void bubbleSort(int[] arr) {
        /*
            @params: int[] arr
            @return: void

            Sorts given arr with bubble sort in O(n) time.
        */

        boolean sorted = false;

        while(!sorted) {
            sorted = true;

            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    sorted = false;
                }
            }
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] leftArr = Arrays.copyOfRange(arr, l, m + 1);
        int[] rightArr = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while(i < leftArr.length && j < rightArr.length) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while(i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        while(j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (right - left) / 2 + left;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void mergeSort(int[] arr) {
        /*
            @params: int[] arr
            @return void

            Sorts arr using merge sort method in O(n * log(n)) complexity.
         */

        if(arr == null || arr.length < 2) {
            return;
        }

        mergeSort(arr, 0, arr.length - 1);
    }

    private static void merge(int arr[], int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while(i < a.length) {
            arr[k++] = a[i++];
        }

        while(j < b.length) {
            arr[k++] = b[j++];
        }
    }

    public static void main(String[] args) {
        a = alloc();
        b = alloc();

        fill(a);
        fill(b);

        System.out.println("A1 initial: " + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("A1 sortat: " + Arrays.toString(a));

        System.out.println("A2 initial: " + Arrays.toString(b));
        mergeSort(b);
        System.out.println("A2 sortat: " + Arrays.toString(b));

        int[] merged = new int[a.length + b.length];
        merge(merged, a, b);
        System.out.println("Output: " + Arrays.toString(merged));
    }
}
