package Jobsheet3.LatihanPraktikum;

public class limas {
    public double panjangSisi;
    public double tinggiLimas;

    public limas(double p, double t) {
        panjangSisi = p;
        tinggiLimas = t;
    }

    public double LuasPermukaanLimas() {
        return (panjangSisi*panjangSisi)+(0.5*panjangSisi*tinggiLimas*4);
    }

    public double VolumeLimas() {
        return (1/3)*panjangSisi*panjangSisi*tinggiLimas;
    }
}