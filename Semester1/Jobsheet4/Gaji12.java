import java.util.Scanner;

public class Gaji12 {
    public static void main (String[] args){
        int jmlmasuk, jmltdkmasuk, totgaji;
        int gaji, potgaji;

        Scanner input= new Scanner(System.in);

        System.out.println("masukkan jumlah masuk");
        jmlmasuk= input.nextInt();
        System.out.println("masukkan jumlah tidak masuk");
        jmltdkmasuk= input.nextInt();
        System.out.println("masukkan gaji");
        gaji= input.nextInt();
        System.out.println("masukkan potongan gaji");
        potgaji= input.nextInt();

        totgaji=(jmlmasuk*gaji)-(jmltdkmasuk*potgaji);
        System.out.println("total gaji anda adalah= " + totgaji);
        
    }
}
