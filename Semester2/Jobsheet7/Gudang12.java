package Jobsheet7;

public class Gudang12 {
    Barang12[] tumpukan;
    int size, top;

    public Gudang12(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang12[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top==-1) {
            return true;
        }else {
            return false;
        }
    }
    
    public boolean cekPenuh() {
        if (top==(size-1)) {
            return true;
        }else {
            return false;
        }
    }

    public void tambahBarang(Barang12 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " +brg.nama+ " Berhasil ditambahkan ke Gudang");
        }else {
            System.out.println("Gagal! Barang di gudang sudah penuh");
        }
    }

    public int cariBarang(int kode) {
        if (!cekKosong()) {
            int posisi = 0;
            for (int i = 0; i < top; i++) {
                if (tumpukan[i].kode==kode) {
                    posisi = i;
                    return posisi;
                }
            }
            return -1;
        }else {
            return -2;
        }
    }

    public Barang12 ambilbarang() {
        if (!cekKosong()) {
            Barang12 delete = tumpukan[top];
            top--;
            System.out.println("Barang " +delete.nama+ " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " +konversiDesimalKeBiner(delete.kode));
            return delete;
        }else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang12 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang12 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " +barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang12 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang12 barangTerbawah = tumpukan[0];
            System.out.println("Barang teratas: " +barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang:");
            for (int i = top; i >= 0; i--) {
                for (int j = 0; j < top; j++) {
                    System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                }
            }
        }else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode!=0) {
            int sisa = kode%2;
            stack.push(sisa);
            kode = kode/2;   
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
