package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        String[][] penonton=new String[4][2];

        for (int i=0;i<penonton.length;i++){
            for (int j=0;j<penonton[i].length;j++){
                penonton[i][j]="***";
            }
        }

        while (true) {
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: exit");
            System.out.print("Masukkan menu yang ingin anda akses: ");
            menu=sc.nextInt();
              
            if (menu==1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama=sc.next();
                    do {
                        System.out.print("Masukkan baris: ");
                        baris=sc.nextInt();
                        if (baris>4){
                            System.out.println("Maaf baris yang anda pilih tidak tersedia");
                        }
                    } while (baris>4);
                    do {
                        System.out.print("Masukkan kolom: ");
                        kolom=sc.nextInt();
                        if (kolom>2){
                            System.out.println("Maaf kolom yang anda pilih tidak tersedia");
                        }
                    } while (kolom>2);
                    sc.nextLine();

                    if (penonton[baris-1][kolom-1]!="***"){
                        System.out.println("Mohon maaf kursi yang ada pilih telah terisi");
                    }
                    penonton[baris-1][kolom-1]=nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next=sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }else if (menu==2) {
                for (int i=0;i<penonton.length;i++) {
                    System.out.println("Penonton pada baris ke-"+(i+1)+": "+String.join(", " , penonton[i]));
                }
            }else if (menu==3) {
                break;
            }
        }
    }
}
