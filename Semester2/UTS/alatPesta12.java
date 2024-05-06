package UTS;

public class alatPesta12 {
    String kodeAlat12, namaAlat12, kategori12; 
    int stock12;

    public alatPesta12(String k, String n, String ktg, int s) {
        kodeAlat12 = k;
        namaAlat12 = n;
        kategori12 = ktg;
        stock12 = s;
    }

    public void tampilData() {
        System.out.println("Kode barang\t: " +kodeAlat12);
        System.out.println("Nama barang\t: " +namaAlat12);
        System.out.println("Kategori\t: " +kategori12);
        System.out.println("Stock barang\t: " +stock12);
    }
}
