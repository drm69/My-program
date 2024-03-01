package Jobsheet3.LatihanPraktikum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] luasPermukaan = new double[3];
        double[] volume = new double[3];
        Object[] bangun = new Object[3];
        kerucut aKerucut = new kerucut();
        limas aLimas = new limas();
        bola aBola = new bola();

        for (int i = 0; i < bangun.length; i++) {
            if (i == 0) {
                System.out.println("Masukkan atribut kerucut");
                System.out.print("Jari jari kerucut   : ");
                aKerucut.rKerucut = sc.nextDouble();
                System.out.print("Sisi miring kerucut : ");
                aKerucut.sisiMiring = sc.nextDouble();

                luasPermukaan[i] = aKerucut.LuasPermukaanKerucut();
                volume[i] = aKerucut.VolumeKerucut();
            }else if (i == 1) {
                System.out.println("Masukkan atribut limas");
                System.out.print("Panjang sisi: ");
                aLimas.panjangSisi = sc.nextDouble();
                System.out.print("Tinggi: ");
                aLimas.tinggiLimas = sc.nextDouble();
                
                luasPermukaan[i] = aLimas.LuasPermukaanLimas();
                volume[i] = aLimas.VolumeLimas();
            }else if (i == 2) {
                System.out.println("Masukkan atribut bola");
                System.out.print("Jari jari bola: ");
                aBola.rBola = sc.nextDouble();
                
                luasPermukaan[i] = aBola.LuasPermukaanBola();
                volume[i] = aBola.VolumeBola();
            }
        }
        
        System.out.println();
        System.out.println("Berikut hasil perhitungan bangun ruang");
        System.out.println("Luas permukaan kerucut  : " +luasPermukaan[0]);
        System.out.println("Volume kerucut          : " +volume[0]);
        System.out.println();
        System.out.println("Luas permukaan limas    : " +luasPermukaan[1]);
        System.out.println("Volume limas            : " +volume[1]);
        System.out.println();
        System.out.println("Luas permukaan bola     : " +luasPermukaan[2]);
        System.out.println("Volume bola             : " +volume[2]);
    }
}
