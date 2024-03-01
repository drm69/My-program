package Jobsheet2;

public class BukuMain12 {
    public static void main(String[] args) {
        Buku12 bk1 = new Buku12();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.jml = 5;

        bk1.terjual();
        bk1.terjual();
        bk1.terjual();
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal();
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku12 bk2 = new Buku12("Self Reward", "Mahera Ayesha", 160, 29, 59000);
        bk2.jml = 11;
        
        bk2.terjual();
        bk2.hitungHargaTotal();
        bk2.hitungDiskon();
        bk2.hitungHargaBayar();
        bk2.tampilInformasi();

        Buku12 bukuDarma = new Buku12("Kunci kesuksesan", "Firdaus Yuli D.", 650, 5, 890000);
        bukuDarma.jml = 4;

        bukuDarma.tampilInformasi();
        bukuDarma.terjual();
        bukuDarma.hitungHargaTotal();
        bukuDarma.hitungDiskon();
        bukuDarma.hitungHargaBayar();
        bukuDarma.tampilInformasi();
    }
}
