package Jobsheet7;

import java.util.Scanner;

public class DoWhileCutiNoAbsen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        
        System.out.print("Jatah cuti: ");
        jatahCuti=sc.nextInt();

        do{
            System.out.print("Apakah anda ingin mengambil cuti?(y/t): ");
            konfirmasi=sc.next();
            
            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari: ");
                jumlahHari=sc.nextInt();

                if(jumlahHari<=jatahCuti){
                    jatahCuti-=jumlahHari;
                    System.out.println("Sisa jatah cuti: "+jatahCuti);
                }else if(jumlahHari>jatahCuti){
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    continue;
                }
            }else if (konfirmasi.equalsIgnoreCase("t")){
                System.out.println("Selamat bekerja");
                break;
            }
        }while(jatahCuti>0);
    }
}
