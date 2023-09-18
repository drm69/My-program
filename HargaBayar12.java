import java.util.Scanner;

public class HargaBayar12 {
    public static void main(String[] args) {
        
        int harga, jumlah;
        double diskon=0.1, total,bayar,jmldiskon;

Scanner input= new Scanner(System.in);

        System.out.println("masukkan harga barang");
        harga= input.nextInt();
        System.out.println("masukkan jumlah barang");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmldiskon=total*diskon;
        bayar=total-jmldiskon;

        System.out.println("total diskon yang anda dapat adalah= " + jmldiskon);
        System.out.println("harga yang harus dibayar           = " + bayar);

    }
}
