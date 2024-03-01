import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char pilihKode;
        char[] KODE = new char[10];
        KODE[0] = 'A';
        KODE[1] = 'B';
        KODE[2] = 'D';
        KODE[3] = 'E';
        KODE[4] = 'F';
        KODE[5] = 'G';
        KODE[6] = 'H';
        KODE[7] = 'L';
        KODE[8] = 'N';
        KODE[9] = 'T';
        char[][] KOTA = new char[10][12];
        KOTA[0][0] = 'B'; KOTA[0][1] = 'A'; KOTA[0][2] = 'N'; KOTA[0][3] = 'T'; KOTA[0][4] = 'E'; KOTA[0][5] = 'N';
        KOTA[1][0] = 'B'; KOTA[1][1] = 'A'; KOTA[1][2] = 'N'; KOTA[1][3] = 'T'; KOTA[1][4] = 'E'; KOTA[1][5] = 'N'; KOTA[1][6] = 'N';
        KOTA[2][0] = 'B'; KOTA[2][1] = 'A'; KOTA[2][2] = 'N'; KOTA[2][3] = 'T'; KOTA[2][4] = 'E'; KOTA[2][5] = 'N'; KOTA[2][6] = 'N';
        KOTA[3][0] = 'B'; KOTA[3][1] = 'A'; KOTA[3][2] = 'N'; KOTA[3][3] = 'T'; KOTA[3][4] = 'E'; KOTA[3][5] = 'N'; KOTA[3][6] = 'N';
        KOTA[4][0] = 'B'; KOTA[4][1] = 'A'; KOTA[4][2] = 'N'; KOTA[4][3] = 'T'; KOTA[4][4] = 'E';
        KOTA[5][0] = 'B'; KOTA[5][1] = 'A'; KOTA[5][2] = 'N'; KOTA[5][3] = 'T'; KOTA[5][4] = 'E'; KOTA[5][5] = 'N'; KOTA[5][6] = 'N'; KOTA[5][7] = 'N'; KOTA[5][8] = 'N'; KOTA[5][9] = 'N';
        KOTA[6][0] = 'B'; KOTA[6][1] = 'A'; KOTA[6][2] = 'N'; KOTA[6][3] = 'T'; KOTA[6][4] = 'E'; KOTA[6][5] = 'N'; KOTA[6][6] = 'N';
        KOTA[7][0] = 'B'; KOTA[7][1] = 'A'; KOTA[7][2] = 'N'; KOTA[7][3] = 'T'; KOTA[7][4] = 'E'; KOTA[7][5] = 'N'; KOTA[7][6] = 'N';
        KOTA[8][0] = 'B'; KOTA[8][1] = 'A'; KOTA[8][2] = 'N'; KOTA[8][3] = 'T'; KOTA[8][4] = 'E'; KOTA[8][5] = 'N';
        KOTA[9][0] = 'B'; KOTA[9][1] = 'A'; KOTA[9][2] = 'N'; KOTA[9][3] = 'T'; KOTA[9][4] = 'E';

        System.out.println("=============");
        System.out.println("Masukkan kode plat: ");
        pilihKode = sc.next().charAt(0);
        System.out.println("=============");

        for (int i = 0; i < KOTA.length; i++) {
            if (KODE[i] == pilihKode) {
                System.out.print("Kode Plat :");
                System.out.println(pilihKode);
                System.out.print("Kota      :");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                break;
            }
        }

    }
}
