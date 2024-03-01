package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int jmlh;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlh=sc.nextInt();
        int[] nilaiMhs=new int[jmlh];
        double total1=0, total2=0;
        double rata2Lulus, rata2TidakLulus;
        int MhsLulus=0, MhsTidakLulus=0;

        for(int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i]=sc.nextInt();
        }
        for(int i=0;i<nilaiMhs.length;i++){
            if (nilaiMhs[i]>70){
                MhsLulus += 1;
                total1 += nilaiMhs[i];
            }else {
                MhsTidakLulus += 1;
                total2 += nilaiMhs[i];
            }
        }
        rata2Lulus=total1/MhsLulus;
        rata2TidakLulus=total2/MhsTidakLulus;
        System.out.println("Rata rata nilai lulus: "+rata2Lulus);
        System.out.println("Rata rata nilai tidak lulus: "+rata2TidakLulus);
    }
}
