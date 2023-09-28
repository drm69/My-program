import java.util.Scanner;

public class Lingkaran12{
    public static void main (String[] args){
        int jarijari;
        double keliling, luas;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jari jari");
        jarijari= input.nextInt();

        luas= jarijari*jarijari*3.14;
        keliling= 2*jarijari*3.14;

        System.out.println("luas    =" + luas);
        System.out.println("keliling=" + keliling);
    }  
    }
    
