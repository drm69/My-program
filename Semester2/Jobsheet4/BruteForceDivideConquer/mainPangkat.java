package Jobsheet4.BruteForceDivideConquer;
import java.util.Scanner;

public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        
        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai yang ingin dipangkatkan ke-" +(i+1)+ ": ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" +(i+1)+ ": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(nilai, pangkat);
        }
        
        System.out.println("==============================================");
        System.out.print("Pilih metode yang ingin digunakan (Brute/Divide): ");
        String pilih = sc.next();

        if (pilih.equalsIgnoreCase("brute")) {
            System.out.println("==============================================");
            System.out.println("Hasil pangkat dengan brute force: ");
            for (int i = 0; i < png.length; i++) {
                System.out.println("Nilai " +png[i].nilai+ " pangkat " +png[i].pangkat+ " adalah: " +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
        }else if (pilih.equalsIgnoreCase("Divide")) {
            System.out.println("==============================================");
            System.out.println("Hasil pangkat dengan divide qonquer: ");
            for (int i = 0; i < png.length; i++) {
                System.out.println("Nilai " +png[i].nilai+ " pangkat " +png[i].pangkat+ " adalah: " +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        }
    }
}
