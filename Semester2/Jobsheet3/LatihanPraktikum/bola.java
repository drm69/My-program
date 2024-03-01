package Jobsheet3.LatihanPraktikum;

public class bola {
    public double rBola;

    public bola(double r) {
        rBola = r;
    }
    public double LuasPermukaanBola() {
        return 4*3.14*rBola*rBola;
    }

    public double VolumeBola(double r) {
        return (4/3)*3.14*rBola*rBola*rBola;
    }
}
