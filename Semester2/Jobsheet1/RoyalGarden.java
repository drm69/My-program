import java.util.Scanner;

public class RoyalGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] bunga = new int[4][4];
        int[] RG4 = new int[4];

        System.out.println("====================");
        System.out.println("Jenis bunga Royal Garden:");
        System.out.println("Bunga ke-1: Aglonema");
        System.out.println("Bunga ke-2: Keladi");
        System.out.println("Bunga ke-3: Alocasia");
        System.out.println("Bunga ke-4: Mawar");
        System.out.println("====================");
        for (int i = 0; i < bunga.length; i++) {
            System.out.println("====================");
            System.out.println("Royal Garden " +(i+1));
            System.out.println("====================");
            for (int j = 0; j < bunga[i].length; j++) {
                System.out.print("Masukkan jumlah bunga ke-" +(j+1)+ ": ");
                bunga[i][j] = sc.nextInt();
            }
        }
        
        pendapatan(bunga);
        System.out.println("====================");
        RG4 = stokRG4(bunga);
        
        System.out.println("====================");
        System.out.println("Stok bunga Royal Garden 4 ");
        System.out.println("Bunga Aglonema  : " +RG4[0]);
        System.out.println("Bunga Keladi    : " +RG4[1]);
        System.out.println("Bunga Alocasia  : " +RG4[2]);
        System.out.println("Bunga Mawar     : " +RG4[3]);
        System.out.println("====================");
    }

    static void pendapatan (int[][] bunga) {
        int[] totPendapatan = new int[4];

        System.out.println("Total pendapatan tiap cabang: ");
        for (int i = 0; i < totPendapatan.length; i++) {
            for (int j = 0; j < bunga[i].length; j++) {
                totPendapatan[i]=(bunga[i][j]*75000)+(bunga[i][j]*50000)+(bunga[i][j]*60000)+(bunga[i][j]*10000);
            }
            System.out.println("Royal Garden" +(i+1)+ ": " +totPendapatan[i]);
        }
    }

    static int[] stokRG4 (int[][] bunga) {
        int[] stokRG4 = new int[4];

        stokRG4[0]=bunga[3][0]-1;
        stokRG4[1]=bunga[3][1]-2;
        stokRG4[2]=bunga[3][2]-0;
        stokRG4[3]=bunga[3][3]-5;

        return stokRG4;
    }
}
