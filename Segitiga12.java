import java.util.Scanner;

public class Segitiga12 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
    
        int alas, tinggi;
        float luassegitiga;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luassegitiga = alas*tinggi / 2;
        System.out.println("Luas segitiga: " + luassegitiga);
      

    

}
        }
        

