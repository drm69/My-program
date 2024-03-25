package Jobsheet5.LatihanPraktikum;

public class Hotel {
    String nama, kota;
    int harga;
    int bintang;

    Hotel(String n, String k, int h, int b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilAll() {
        System.out.println("Nama hotel  : " +nama);
        System.out.println("Kota        : " +kota);
        System.out.println("Harga       : " +harga);
        System.out.println("Bintang     : " +bintang);
    }
}
