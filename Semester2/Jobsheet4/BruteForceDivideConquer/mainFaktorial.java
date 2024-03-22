package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long startTime = System.nanoTime();
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < fk.length; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke " +(i+1)+ ": ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("=============================================");
        System.out.println("Hasil faktorial dengan brute force: ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " +fk[i].nilai+ " adalah: " +fk[i].faktorialBF(fk[i].nilai));
        }
        
        System.out.println("=============================================");
        System.out.println("Hasil faktorial dengan Divide and Qonquer: ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " +fk[i].nilai+ " adalah: " +fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("=============================================");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000000;
        System.out.println("Waktu eksekusi: " + duration + " detik");
    }
}
