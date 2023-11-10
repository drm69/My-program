package Jobsheet11;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;

        while(i <= N) {
            int j = N;
            while(j > i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
