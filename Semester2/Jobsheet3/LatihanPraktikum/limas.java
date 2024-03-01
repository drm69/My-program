package Jobsheet3.LatihanPraktikum;

public class limas {
    public double panjangSisi;
    public double tinggiLimas;

    public double LuasPermukaanLimas() {
        return (panjangSisi*panjangSisi)+(0.5*panjangSisi*tinggiLimas*4);
    }

    public double VolumeLimas() {
        return (0.33)*panjangSisi*panjangSisi*tinggiLimas;
    }
}