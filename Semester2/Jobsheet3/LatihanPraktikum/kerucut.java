package Jobsheet3.LatihanPraktikum;

public class kerucut {
    public double rKerucut;
    public double sisiMiring;

    public double LuasPermukaanKerucut() {
        return (3.14*rKerucut)*(sisiMiring+rKerucut);
    }

    public double VolumeKerucut() {
        double luasp, kuadrat1, kuadrat2, t;
        luasp = (0.33)*3.14*rKerucut*rKerucut;
        kuadrat1 = sisiMiring*sisiMiring;
        kuadrat2 = rKerucut*rKerucut;
        t = Math.sqrt(kuadrat1-kuadrat2);
        return luasp*t;
    }
}
