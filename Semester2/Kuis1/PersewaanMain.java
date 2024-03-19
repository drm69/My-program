package Kuis1;

import java.util.Scanner;

public class PersewaanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pilih;
        System.out.println("Selamat datang di Sistem Persewaan Kendaraan");
        System.out.println("Pilih menu: ");
        System.out.println("1. Sewa");
        System.out.println("2. Pengembalian");
        System.out.print("input: ");
        pilih = sc.nextLine();

        kendaraan atrKendaraan = new kendaraan();

        if (pilih.equalsIgnoreCase("sewa")) {
            System.out.print("Pilih kendaraan yang ingin anda sewa: ");
            atrKendaraan.jenKendaraan = sc.nextLine();

            System.out.println("Masukkan data " +atrKendaraan.jenKendaraan+ ": ");
            System.out.print("Merk              :");
            atrKendaraan.merk = sc.nextLine();
            System.out.print("Model             :");
            atrKendaraan.jen = sc.nextLine();
            System.out.print("Waktu Sewa(hari)  : ");
            atrKendaraan.waktuSewa = sc.nextInt();

            atrKendaraan.tampilInformasi();
            
        }else if (pilih.equalsIgnoreCase("pengembalian")) {
            System.out.print("Pilih kendaraan yang ingin dikembalikan: ");
            atrKendaraan.jenKendaraan = sc.nextLine();
            
            System.out.print("Waktu Sewa(hari):");
            atrKendaraan.waktuSewa = sc.nextInt();
            System.out.print("Tanggal Sewa      : ");
            atrKendaraan.tglSewa = sc.nextInt();
            System.out.print("Tanggal Kembali   : ");
            atrKendaraan.tglKembali = sc.nextInt();

            int biaya = atrKendaraan.hitungBiaya(atrKendaraan.waktuSewa);
            atrKendaraan.hitungDenda(biaya, atrKendaraan.jenKendaraan, atrKendaraan.waktuSewa);
        } 
    }
}
