package Jobsheet3.LatihanPraktikum;

public class kerucut {
    public double rKerucut;
    public double sisiMiring;

    public kerucut(double r, double s) {
        rKerucut = r;
        sisiMiring = s;
    }
    public double LuasPermukaanKerucut() {
        return (3.14*rKerucut)*(sisiMiring+rKerucut);
    }

    public double VolumeKerucut() {
        return ((1/3)*3.14*rKerucut*rKerucut)*(Math.sqrt((sisiMiring*sisiMiring)-((1/2)*rKerucut*rKerucut)));
    }
}
