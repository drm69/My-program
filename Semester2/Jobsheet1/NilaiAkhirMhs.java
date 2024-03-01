import java.util.Scanner;

public class NilaiAkhirMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] Nilai = new double[4];
        double nilaiAkhir;

        System.out.println("Program menghitung nilai akhir");
        System.out.println("==========================");
        System.out.print("Masukkan nilai tugas: ");
        Nilai[0] = sc.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        Nilai[1] = sc.nextInt();
        System.out.print("Masukkan nilai UTS  : ");
        Nilai[2] = sc.nextInt();
        System.out.print("Masukkan nilai UAS  : ");
        Nilai[3] = sc.nextInt();
        System.out.println("==========================");
        System.out.println("==========================");
        
        for (int i = 0; i < Nilai.length; i++) {
            if (Nilai[i]<0 || Nilai[i]>100) {
                System.out.println("Nilai tidak valid!");
                System.out.println("==========================");
                System.out.println("==========================");
                break;
            }else {
                continue;
            }
        }
        nilaiAkhir = totNilai(Nilai);
        nilaiAbjad (nilaiAkhir);
    }

    static double totNilai (double[] Nilai) {
        double hasilAkhir;
        double[] hasil = new double[4];

        hasil[0] = Nilai[0]*(0.1);
        hasil[1] = Nilai[1]*(0.2);
        hasil[2] = Nilai[2]*(0.3);
        hasil[3] = Nilai[3]*(0.4);
        
        hasilAkhir = hasil[0]+hasil[1]+hasil[2]+hasil[3];
        return hasilAkhir;
    }

    static void nilaiAbjad (double nilaiAkhir) {
        if (80<nilaiAkhir && nilaiAkhir<=100) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: A");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Selamat Anda lulus ");
        }else if (73<nilaiAkhir && nilaiAkhir<=80) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: B+");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Selamat Anda lulus ");
        }else if (65<nilaiAkhir && nilaiAkhir<=73) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: B");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Selamat Anda lulus ");
        }else if (60<nilaiAkhir && nilaiAkhir<=73) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: C+");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Selamat Anda lulus ");
        }else if (50<nilaiAkhir && nilaiAkhir<=60) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: C");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Selamat Anda lulus ");
        }else if (39<nilaiAkhir && nilaiAkhir<=50) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: D");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Anda gagal");
        }else if (nilaiAkhir<=39) {
            System.out.println("Nilai akhir: " +nilaiAkhir);
            System.out.println("Nilai huruf: E");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Anda gagal");
        }
    }
}
