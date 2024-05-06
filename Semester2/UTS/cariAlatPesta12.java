package UTS;

public class cariAlatPesta12 {
    alatPesta12 listAlat12[] = new alatPesta12[4];
    int idx12;

    void tambah12(alatPesta12 m) {
        if (idx12<listAlat12.length) {
            listAlat12[idx12] = m;
            idx12++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil12() {
        System.out.println("Barang diurutkan berdasarkan stock");
        for (alatPesta12 m : listAlat12) {
            System.out.println("============================");
            m.tampilData();
        }
    }

    public int cariBarang12(String cari) {
        int posisi = 0;
        for (int i = 0; i < listAlat12.length; i++) {
            if (listAlat12[i].namaAlat12.equalsIgnoreCase(cari)) {
                posisi = i;
                return posisi;
            }
        }
        return -1;
    }

    public void tampilPosisi12(String x, int pos) {
        if (pos!=-1) {
            System.out.println("=======================================");
            System.out.println(x+ " ditemukan di rak ke-" +(pos+1));
            System.out.println("Kode barang\t: " +listAlat12[pos].kodeAlat12);
            System.out.println("Nama barang\t: " +x);
            System.out.println("Kategori\t: " +listAlat12[pos].kategori12);
            System.out.println("Stock\t\t: " +listAlat12[pos].stock12);
        }else {
            System.out.println(x+ " tidak ditemukan");
        }
    }

    void bubbleShort12() {
        for (int i = 0; i < listAlat12.length-1; i++) {
            for (int j = 1; j < listAlat12.length-i; j++) {
                if (listAlat12[j].stock12>listAlat12[j-1].stock12) {
                    alatPesta12 tmp = listAlat12[j];
                    listAlat12[j] = listAlat12[j-1];
                    listAlat12[j-1] = tmp;
                }
            }
        }
    }
}
