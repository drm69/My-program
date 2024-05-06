package Jobsheet8.Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("6. Cek posisi antrian");
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas pembeli: ");
        int Jumlah = sc.nextInt();
        Queue antri = new Queue(Jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No Hp: ");
                    int noHp = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, noHp);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                        break;
                    }
                case 3:
                antri.peek();
                    break;
                case 4:
                antri.print();
                    break;
                case 5:
                antri.peekRear();
                    break;
                case 6:
                System.out.println("Masukkan nama pembeli: ");
                String nm = sc.nextLine();
                antri.peekPosition(nm);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
