package Jobsheet11;

import java.util.Scanner;

public class NestedLoop_2341720244 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double[][] temps = new double[5][7];
        double rataRata, total=0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++) {  
                System.out.print("Hari ke-" + (j + 1) + ": ");  
                temps[i][j] = scanner.nextDouble();
                total += temps[i][j];
            }
            rataRata=total/7;
            System.out.println("Rata rata suhu kota ke-"+(i+1)+" adalah"+rataRata);
            System.out.println();
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");  
            for (int j = 0; j < temps[0].length; j++) {  
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

        for (double[] tempsKota : temps) {
            int i=1;
            System.out.println("Kota ke-"+i);
            i++;
            for (double temp : tempsKota) {
                System.out.print(temp+", ");
            }
            System.out.println();
        }
    }
}
