import java.util.Scanner;

public class Lingkaran12{
    public static void main (String[] args){
        int jarijari;
        double phi=3.14;
        double keliling, luas;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jari jari");
        jarijari= input.nextInt();

        luas= jarijari*jarijari*phi;
        keliling= 2*jarijari*phi;

        System.out.println("luas    =" + luas);
        System.out.println("keliling=" + keliling);
    }  
    }
    
