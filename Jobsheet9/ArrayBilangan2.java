package Jobsheet9;

import java.util.Scanner;

public class ArrayBilangan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int jmlhBil;
        System.out.print("Masukkan jumlah bilangan: ");
        jmlhBil=sc.nextInt();

        int[] bil=new int[jmlhBil];
        double rata2;
        int total=0, temp=0;

        for(int i=0;i<bil.length;i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            bil[i]=sc.nextInt();
            total += bil[i];
        }
        for(int i=0;i<bil.length;i++){
            for(int j=1;j<bil.length-i;j++){
                if (bil[j-1]<bil[j]){
                    temp=bil[j];
                    bil[j]=bil[j-1];
                    bil[j-1]=temp;
                }
            }
        }
        rata2=total/jmlhBil;
        System.out.println("Bilangan terkecil: "+bil[jmlhBil-1]);
        System.out.println("Bilangan terbesar: "+bil[jmlhBil-jmlhBil]);
        System.out.println("Rata-rata bilangan: "+rata2);
    }
}
