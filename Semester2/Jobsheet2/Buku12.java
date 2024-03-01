package Jobsheet2;

public class Buku12 {
    String judul, pengarang;
    int halaman, stok, harga, jml, hargaTot, diskon, bayar;

    void tampilInformasi() {
        System.out.println("Judul: " +judul);
        System.out.println("Pengarang: " +pengarang);
        System.out.println("Jumlah halaman: " +halaman);
        System.out.println("Sisa stok: " +stok);
        System.out.println("Harga: " +harga);
        System.out.println("Harga Total: " +hargaTot);
        System.out.println("Total diskon: " +diskon);
        System.out.println("Harga Total yang harus dibayar: " +bayar);
    }

    void terjual() {
        if (stok > 0 && stok > jml) {
            stok -= jml;
        }else {
            System.out.println("Maaf stok tidak mencukupi");
            System.out.println("Sisa stok: " +stok);
        }
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku12() {
        
    }

    public Buku12(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal() {
        hargaTot = harga*jml;
        return hargaTot;
    }

    int hitungDiskon() {
        hargaTot = hitungHargaTotal();
        if(hargaTot > 150000) {
            diskon = (int)(hargaTot*(0.12));
        }else if (hargaTot > 75000 && hargaTot <= 150000) {
            diskon = (int)(hargaTot*(0.05));
        }
        return diskon;
    }
    int hitungHargaBayar() {
        diskon = hitungDiskon();
        bayar = hargaTot - diskon;
        return bayar;
    }
}
