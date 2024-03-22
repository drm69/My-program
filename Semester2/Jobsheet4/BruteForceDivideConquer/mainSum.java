package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================================");
        System.out.println("Program menghitung keuntungan total (Satuan juta. misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlh = sc.nextInt();
        for (int j = 0; j < jmlh; j++) {
            System.out.println("=============================================================");
            System.out.print("Masukkan jumlah bulan perusahaan ke-" +(j+1)+ ": ");
            int elm = sc.nextInt();
            
            sum sm = new sum(elm);
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" +(i+1)+ ": ");
                sm.keuntungan[i] = sc.nextDouble();
            }
            
            System.out.println("=============================================================");
            System.out.println("Algoritma brute force:");
            System.out.println("Total keuntungan perusahaan ke-" +(j+1)+ " selama " +sm.elemen+ " bulan adalah: " +sm.totalBF(sm.keuntungan));
            
            System.out.println("=============================================================");
            System.out.println("Algoritma divide qonquer:");
            System.out.println("Total keuntungan perusahaan ke-" +(j+1)+ " selama " +sm.elemen+ " bulan adalah: " +sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        }
    }
}
