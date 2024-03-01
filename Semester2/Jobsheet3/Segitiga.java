package Jobsheet3;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    void tampilAtribut() {
        System.out.println("luas segitiga: " +hitungLuas());
        System.out.println("keliling segitiga: " +hitungKeliling());
    }

    int hitungLuas() {
        return alas*tinggi/2;
    }

    int hitungKeliling() {
        double sisiMiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return (int)(alas+tinggi+sisiMiring);
    }
}
