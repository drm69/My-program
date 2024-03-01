package Jobsheet3.DataMhs;

public class Mahasiswa {
    String nama;
    int nim;
    char jenisKelamin;
    double ipk;

    void tampilInformasi(int i) {
        System.out.println("Data mahasiswa ke-" +(i+1));
        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("Jenis Kelamin: " +jenisKelamin);
        System.out.println("IPK: " +ipk);
    }
}
