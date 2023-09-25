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
        String message= total<65 ? "remidi" : "tidak remidi";

        System.out.println("Nilai akhir "+total+" sehingga "+message);
    }
} 
