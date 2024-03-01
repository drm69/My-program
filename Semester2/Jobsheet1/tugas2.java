import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih menu (1/2/3): ");
        int menu = scanner.nextInt();
        double hasil = 0.0;

        switch (menu) {
            case 1:
                hasil = hitungKecepatan();
                System.out.println("Kecepatan: " + hasil + " m/s");
                break;
            case 2:
                hasil = hitungJarak();
                System.out.println("Jarak: " + hasil + " meter");
                break;
            case 3:
                hasil = hitungWaktu();
                System.out.println("Waktu: " + hasil + " detik");
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
        scanner.close();
    }

    static double hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double waktu = scanner.nextDouble();
        double kecepatan = jarak / waktu;

        return kecepatan;
    }

    static double hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double waktu = scanner.nextDouble();
        double jarak = kecepatan * waktu;

        return jarak;
    }

    static double hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();
        double waktu = jarak / kecepatan;

        return waktu;
    }
}
