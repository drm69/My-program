package Jobsheet9.Tugas2;

public class Mhs {
    int nim;
    String nama;
    Mhs next;

    Mhs(int nim, String nama, Mhs berikutnya) {
        this.nim = nim;
        this.nama = nama;
        next = berikutnya;
    }
}
