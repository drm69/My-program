package Jobsheet9.Tugas2;

import java.util.Scanner;

public class main {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek posisi antrian");
        System.out.println("---------------------------------------");
        System.out.print("pilih: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("Selamat datang di unit layanan kemahasiswaan");
        System.out.println("============================================");
        SingleLinkedList antrian = new SingleLinkedList();

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    int nim = sc.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.next();
                    antrian.addLast(nim, nama);
                    break;
                case 2:
                    antrian.removeFirst();
                    System.out.println("Terimakasih!! Sampai jumpa kembali...");
                    break;
                case 3:
                    System.out.println("Mahasiswa " + antrian.getData(0) + " berada di antrian terdepan");
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    int n = sc.nextInt();
                    System.out.println("Mahasiswa dengan NIM " +n+ " berada di antrian ke-" +antrian.indexOf(n));
                    break;
            }
        } while (true);
    }
}
