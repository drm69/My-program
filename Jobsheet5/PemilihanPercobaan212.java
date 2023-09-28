import java.util.Scanner;

public class PemilihanPercobaan212 {
    public static void main(String[] args) {
        Scanner input12=new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas=input12.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts=input12.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis=input12.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas=input12.nextFloat();

        float total=(uas*0.4f)+(uts*0.3f)+(kuis*0.1f)+(tugas*0.2f);
        
        if(total>80&&total<=100){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : A");
            System.out.println("Nilai setara: 4");
            System.out.println("Kualifikasi : Sangat baik");
        }else if(total>73&&total<=80){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : B+");
            System.out.println("Nilai setara: 3.5");
            System.out.println("Kualifikasi : Lebih dari baik");
        }else if(total>65&&total<=73){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : B");
            System.out.println("Nilai setara: 3");
            System.out.println("Kualifikasi : Baik");
        }else if(total>60&&total<=65){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : C+");
            System.out.println("Nilai setara: 2.5");
            System.out.println("Kualifikasi : Lebih dari cukup");
        }else if(total>50&&total<=60){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : C");
            System.out.println("Nilai setara: 2");
            System.out.println("Kualifikasi : Cukup");
        }else if(total>39&&total<=50){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : D");
            System.out.println("Nilai setara: 1.5");
            System.out.println("Kualifikasi : Kurang");
        }else if(total<=39){
            System.out.println("Nilai mutu anda");
            System.out.println("Nilai huruf : E");
            System.out.println("Nilai setara: 1");
            System.out.println("Kualifikasi : Gagal");
        }
    }
} 
