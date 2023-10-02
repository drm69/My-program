package Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan112 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tahun;

        System.out.println("masukkan tahun: ");
        tahun=input.nextInt();
        if ((tahun%4)==0){
            if((tahun%100)!=0)
                System.out.println("Tahun "+tahun+" tahun kabisat");
        }else{
            System.out.println("Tahun "+tahun+" bukan tahun kabisat");
        }
    }
}
