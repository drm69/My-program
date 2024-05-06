package UTS;

import java.util.Scanner;

public class alatPestaMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cariAlatPesta12 barang = new cariAlatPesta12();
        alatPesta12 m1 = new alatPesta12("a11", "Renda", "Hiasan", 10);
        barang.tambah12(m1);
        alatPesta12 m2 = new alatPesta12("a12", "Microphone", "Elektronik", 5);
        barang.tambah12(m2);
        alatPesta12 m3 = new alatPesta12("b21", "Speaker", "Elektronik", 4);
        barang.tambah12(m3);
        alatPesta12 m4 = new alatPesta12("b22", "Terompet", "Lain-lain", 14);
        barang.tambah12(m4);
        barang.bubbleShort12();

        while (true) {
            System.out.println("=======================================");
            System.out.println("Selamat datang di persewaan alat pesta");
            System.out.println("1. List barang");
            System.out.println("2. Cari barang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu yang ingin anda akses: ");
            int pilih = sc.nextInt();
            System.out.println("=======================================");
            
            if (pilih == 1) {
                barang.tampil12();
            }else if (pilih == 2) {
                System.out.print("Masukkan nama barang yang ingin dicari: ");
                String cari = sc.next();
                barang.tampilPosisi12(cari, barang.cariBarang12(cari));
            }else if (pilih == 3) {
                System.out.println("Selamat Jalan");
                System.out.println("=======================================");
                break;
            }else {
                System.out.println("INPUT ERROR");
            }
        }
    }
}
