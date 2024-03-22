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

    void rataipk(Mahasiswa[] dataMahasiswa) {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += dataMahasiswa[i].ipk;
        }
        System.out.println("Rata rata ipk Mahasiswa: " + (total/3));
    }

    void Tertinggi(Mahasiswa[] dataMahasiswa) {
        double tertinggi = 0;
        
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i].ipk > tertinggi) {
                tertinggi = dataMahasiswa[i].ipk;
            }
        }

        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i].ipk == tertinggi) {
                System.out.println();
                System.out.println("Berikut data Mahasiswa dengan nilai IPK tertinggi:");
                dataMahasiswa[i].tampilInformasi(i);
                break;
            }
        }
    }
}
