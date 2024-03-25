package Jobsheet5.LatihanPraktikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Oyo", "Malang", 100000, 3);
        Hotel h2 = new Hotel("RedDoorz", "Bandung", 125000, 4);
        Hotel h3 = new Hotel("Kubu Alit", "Bali", 125000, 5);
        Hotel h4 = new Hotel("Permata", "Jember", 75000, 4);
        Hotel h5 = new Hotel("Aston", "Solo", 250000, 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Selamat datang di layanan reserve hotel TravelIndo");
        System.out.println("Berikut list hotel yang tersedia di beberapa kota:");
        list.tampilAll();

        for (; ; ) {
            System.out.print("Pilih filter yang ingin anda terapkan(harga/rating): ");
            String pilih = sc.nextLine();
            if (pilih.equalsIgnoreCase("harga")) {
                System.out.println("Berikut list hotel berdasarkan harga:");
                list.bubbleShort();
                list.tampilAll();
                break;
            }else if (pilih.equalsIgnoreCase("rating")) {
                System.out.println("Berikut list hotel berdasarkan rating bintang:");
                list.selectionShort();
                list.tampilAll();
                break;
            }else {
                System.out.println("INPUT ERROR!!");

            }
        }
    }
}
