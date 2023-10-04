package Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan212 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalSudut;

        System.out.print("Masukkan sudut 1: ");
        sudut1=input.nextFloat();
        System.out.print("Masukkan sudut 2: ");
        sudut2=input.nextFloat();
        System.out.print("Masukkan sudut 3: ");
        sudut3=input.nextFloat();
        totalSudut=sudut1+sudut2+sudut3;

        if(totalSudut==180){
            if((sudut1==90)||(sudut2==90)||(sudut3==90))
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            else if((sudut1==sudut2)||(sudut2==sudut3)||(sudut3==sudut1))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        }else
        System.out.println("Bukan segitiga");
    }
}
