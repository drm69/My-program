package Jobsheet6.TestSearching;

import java.util.Scanner;

public class BukuMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku12 data = new PencarianBuku12();
        int jumBuku = 5;

        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------");
            System.out.print("Kode buku\t:");
            String kodeBuku = sc.next();
            System.out.print("Judul buku\t:");
            String judBuku = sc1.nextLine();
            System.out.print("Tahun terbit\t:");
            int tahunTerbit = sc.nextInt();
            System.out.print("Pengarang\t:");
            String pengarang = sc1.nextLine();
            System.out.print("Stock\t\t:");
            int stock = sc.nextInt();

            Buku12 m = new Buku12(kodeBuku, judBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("----------------------------");
        System.out.println("Data keseluruhan buku: ");
        data.bubbleShort();
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        String cari = sc.next();
        System.out.println("Menggunakan sequintial search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        System.out.println("=================================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.tampilPosisi(cari, posisi);
        
        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.print("Masukkan judul buku yang dicari: ");
        cari = sc.next();
        System.out.println("Menggunakan sequintial search");
        posisi = data.findSeqSearchJudul(cari);
        data.tampilPosisi(cari, posisi);
        System.out.println("=================================");
        System.out.println("Menggunakan binary search");
        posisi = data.findBinarySearchJudul(cari);
        data.tampilPosisi(cari, posisi);
    }
}
