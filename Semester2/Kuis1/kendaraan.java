package Kuis1;

public class kendaraan {
    public String jenKendaraan;
    public String merk, jen;
    public int waktuSewa, total;
    public double keterlambatan, tglSewa, tglKembali, denda;

    void tampilInformasi() {
        hitungBiaya(waktuSewa);
        System.out.println("Berikut data " +jenKendaraan+ " yang telah anda masukkan:");
        System.out.println("Merk Mobil      : " +merk);
        System.out.println("Jenis Mobil     : " +jen);
        System.out.println("Waktu Sewa(hari): " +waktuSewa);
        System.out.println("Total Biaya Sewa: " +total);
    }

    int hitungBiaya(int waktuSewa) {
        if (jenKendaraan.equalsIgnoreCase("mobil")) {
            total = waktuSewa*300000;
        }else if (jenKendaraan.equalsIgnoreCase("motor")) {
            total = waktuSewa*50000;
        }
        return total;
    }

    void hitungDenda(int total, String jenisKend, int waktuSewa) {
        keterlambatan = (tglKembali-tglSewa)-waktuSewa;
        if (keterlambatan<1) {
            System.out.println("Anda tidak dikenakan denda");
        }else {
            if (jenisKend.equalsIgnoreCase("mobil")) {
                denda = 300000*0.1*(keterlambatan);
                System.out.println("Total denda             : " +denda);
                System.out.println("Total yang harus dibayar: " +(total+denda));
            }else if (jenKendaraan.equalsIgnoreCase("motor")) {
                denda = 50000*0.05*keterlambatan;
                System.out.println("Total denda             : " +denda);
                System.out.println("Total yang harus dibayar: " +(total+denda));
            }
        }
    }
}
