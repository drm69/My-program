package Jobsheet13;

import java.util.Scanner;

public class UcapanTerimakasih_12 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        UcapanTambahan("Thanks for all the things that you do");
    }
}
