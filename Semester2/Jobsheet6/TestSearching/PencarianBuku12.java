package Jobsheet6.TestSearching;

public class PencarianBuku12 {
    Buku12 listbk[] = new Buku12[5];
    int idx;

    void tambah(Buku12 m) {
        if (idx<listbk.length) {
            listbk[idx] = m;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku12 m : listbk) {
            m.tampiDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = 0;
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].kodeBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                return posisi;
            }
        }
        return -1;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos!=-1) {
            System.out.println("=====================");
            System.out.println("Data: " +x+ " ditemukan pada index " +pos);
            System.out.println("Kode buku\t: " +x);
            System.out.println("Judul buku\t: " +listbk[pos].judulBuku);
            System.out.println("Tahun terbit\t: " +listbk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " +listbk[pos].pengarang);
            System.out.println("Stock\t\t: " +listbk[pos].stock);
        }else {
            System.out.println("Data " +x+ " tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equals(listbk[mid].kodeBuku)) {
                return mid;
            } else if (listbk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    int FindBuku(String cari) {
        int posisi = 0;
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].kodeBuku==cari) {
                posisi=i;
                return posisi;
            }
        }
        return -1;
    }

    public int findSeqSearchJudul(String cari) {
        int posisi = -1;
        int jumlahDitemukan = 0;
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].judulBuku.toLowerCase().contains(cari.toLowerCase())) {
                posisi = i;
                jumlahDitemukan++;
            }
        }

        if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: " + jumlahDitemukan + " buku ditemukan dengan judul yang mengandung \"" + cari + "\".");
        }

        return posisi;
    }

    public int findBinarySearchJudul(String cari) {
        int left = 0;
        int right = listbk.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            int cmp = listbk[mid].judulBuku.toLowerCase().compareTo(cari.toLowerCase());

            if (cmp == 0) {
                return mid;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    void bubbleShort() {
        for (int i = 0; i < listbk.length-1; i++) {
            for (int j = 1; j < listbk.length-i; j++) {
                if (listbk[j].tahunTerbit>listbk[j-1].tahunTerbit) {
                    Buku12 tmp = listbk[j];
                    listbk[j] = listbk[j-1];
                    listbk[j-1] = tmp;
                }
            }
        }
    }

}
