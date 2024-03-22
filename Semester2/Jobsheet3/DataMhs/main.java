package Jobsheet3.DataMhs;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] dataMahasiswa = new Mahasiswa[3];

        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = new Mahasiswa(); 
            System.out.println("Masukkan data mahasiswa ke- " +(i+1));
            System.out.print("Masukkan Nama: ");
            dataMahasiswa[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            dataMahasiswa[i].nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            dataMahasiswa[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            dataMahasiswa[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i].tampilInformasi(i);
        }
        dataMahasiswa[0].rataipk(dataMahasiswa);
        dataMahasiswa[0].Tertinggi(dataMahasiswa);
    }
}
