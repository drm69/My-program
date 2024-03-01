package Jobsheet3;

import java.util.Scanner;

public class rakBukuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rakBuku[][] dataRak = new rakBuku[2][3];

        for (int i = 0; i < dataRak.length; i++) {
            System.out.println("Masukkan data rak buku ke-" +(i+1));
            for (int j = 0; j < dataRak[i].length; j++) {
                dataRak[i][j] = new rakBuku();
                System.out.println("Buku ke-" +(j+1));
                System.out.print("Judul     : ");
                dataRak[i][j].judul = sc.nextLine();
                System.out.print("Pengarang : ");
                dataRak[i][j].pengarang = sc.nextLine();
            }
            System.out.println();
        }

        for (int i = 0; i < dataRak.length; i++) {
            System.out.println("Informasi buku rak ke-" +(i+1));
            for (int j = 0; j < dataRak[i].length; j++) {
                System.out.println((j+1)+ ". Judul: " +dataRak[i][j].judul+ ", Pengarang: " +dataRak[i][j].pengarang);
            }
        }
    }
}
