package Jobsheet7;

import java.util.Scanner;

public class Utama12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = sc.nextInt();
        Gudang12 gudang = new Gudang12(kapasitas);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Tampilkan barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.next();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.next();
                    Barang12 barangBaru = new Barang12(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilbarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode barang yang dicari: ");
                    int a = sc.nextInt();
                    gudang.cariBarang(a);
                    if (gudang.cariBarang(a)>=0) {
                        System.out.println("Barang dengan kode " +a+ " ada pada tumpukan ke-" +gudang.cariBarang(a));
                    }else if (gudang.cariBarang(a)==-1) {
                        System.out.println("Barang dengan kode " +a+ " tidak ada pada gudang");
                    }else {
                        System.out.println("Gudang kosong");
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Pilihan tidak valid! silahkan coba lagi");
            }
        }
    }
}
