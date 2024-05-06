package Jobsheet6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan data: ");
        int input = sc.nextInt();
        System.out.print("Masukkan data yang dicari: ");
        int cari = sc.nextInt();
        coba m1 = new coba(input, cari);

        if (m1.insertionShort()>=0) {
            System.out.println("Data ada di index ke-" +m1.insertionShort());
        }else {
            System.out.println("Data tidak ada");
        }
    }
}
