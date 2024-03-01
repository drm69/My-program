import java.util.Scanner;

public class NilaiTegangan {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
    
        int hambatanA, hambatanB, hambatanC;
        byte hambatanD, kuatarus;
        double tegangan;

        System.out.print("Masukkan R1: ");
        hambatanA = sc.nextInt();
        System.out.print("Masukkan R2: ");
        hambatanB = sc.nextInt();
        System.out.print("Masukkan R3: ");
        hambatanC = sc.nextInt();
        System.out.print("Masukkan R4: ");
        hambatanD = sc.nextByte();
        System.out.print("Masukkan I : ");
        kuatarus = sc.nextByte();

        tegangan = ((hambatanA*hambatanB*hambatanC/((hambatanB*hambatanC)+(hambatanA*hambatanC)+(hambatanA*hambatanB)))+hambatanD)*kuatarus;
        System.out.println("Nilai tegangan: " + tegangan);
    }
}
