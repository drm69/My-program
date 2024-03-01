package Jobsheet7;

import java.util.Scanner;

public class ForKelipatan12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int kelipatan, jumlah=0, counter=0, total=0;
        int rataRata=0;

        System.out.print("masukkan bilangan kelipatan (1-9): ");
        kelipatan=scan.nextInt();

        for (int i=1;i<=50;i++){
            if (i% kelipatan==0){
                total += i;
                counter++;
                if (counter>0){
                    rataRata=total/counter;
                }
            }
        }        
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
        System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,total);
        System.out.printf("Total rata rata bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,rataRata);
    }
}
