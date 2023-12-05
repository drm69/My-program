package Jobsheet14;

import java.util.Scanner;

public class tugas112 {
    static void deretDescendingRekursif (int x) {
        if (x >= 0) {
            System.out.println(x);
            deretDescendingRekursif(x - 1);
        }    
    }

    static void deretDescendingIteratif (int x) {
        for (int i = x; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai x : ");
        int n = sc.nextInt();
        System.out.println("Deret menggunakan Rekursif : ");
        deretDescendingRekursif(n);
        System.out.println("Deret Menggunakan Iteratif : ");
        deretDescendingIteratif(n);
    }
}
