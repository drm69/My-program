import java.util.Scanner;

public class ipSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] nilai = new double[2][8];
        String[] nilaiHuruf = new String[8];
        double ip;
        double totNilai, bobotSKS=18;

        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        System.out.print("Masukkan nilai MK Pancasila       : ");
        nilai[0][0] = sc.nextDouble();
        System.out.print("Masukkan nilai MK KTI             : ");
        nilai[0][1] = sc.nextDouble();
        System.out.print("Masukkan nilai MK CTPS            : ");
        nilai[0][2] = sc.nextDouble();
        System.out.print("Masukkan nilai MK MatDas          : ");
        nilai[0][3] = sc.nextDouble();
        System.out.print("Masukkan nilai MK B. Inggris 1    : ");
        nilai[0][4] = sc.nextDouble();
        System.out.print("Masukkan nilai MK DasPro          : ");
        nilai[0][5] = sc.nextDouble();
        System.out.print("Masukkan nilai MK Praktikum DasPro: ");
        nilai[0][6] = sc.nextDouble();
        System.out.print("Masukkan nilai MK K3              : ");
        nilai[0][7] = sc.nextDouble();
        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        
        for (int i = 0; i < nilai[0].length; i++) {
            if (80<nilai[0][i] && nilai[0][i]<=100) {
                nilai[1][i]=4;
                nilaiHuruf[i]="A";
            }else if (73<nilai[0][i] && nilai[0][i]<=80) {
                nilai[1][i]=3.5;
                nilaiHuruf[i]="B+";
            }else if (65<nilai[0][i] && nilai[0][i]<=73) {
                nilai[1][i]=3;
                nilaiHuruf[i]="B";
            }else if (60<nilai[0][i] && nilai[0][i]<=73) {
                nilai[1][i]=2.5;
                nilaiHuruf[i]="C+";
            }else if (50<nilai[0][i] && nilai[0][i]<=60) {
                nilai[1][i]=2;
                nilaiHuruf[i]="C";
            }else if (39<nilai[0][i] && nilai[0][i]<=50) {
                nilai[1][i]=1;
                nilaiHuruf[i]="D";
            }else if (nilai[0][i]<=39) {
                nilai[1][i]=0;
                nilaiHuruf[i]="E";
            }
        }
        totNilai = (nilai[1][0]*2)+(nilai[1][1]*2)+(nilai[1][2]*2)+(nilai[1][3]*3)+
        (nilai[1][4]*2)+(nilai[1][5]*2)+(nilai[1][6]*3)+(nilai[1][7]*2);
        ip = totNilai/bobotSKS;
        
        System.out.println("=======================");
        System.out.println("MK                                  Nilai Angka     Nilai Huruf     Bobot Nilai");
        System.out.println("Pancasila                           " +nilai[0][0]+ "               " +nilai[1][0]+ "               " +nilaiHuruf[0]);
        System.out.println("KTI                                 " +nilai[0][1]+ "               " +nilai[1][1]+ "               " +nilaiHuruf[1]);
        System.out.println("CTPS                                " +nilai[0][2]+ "               " +nilai[1][2]+ "               " +nilaiHuruf[2]);
        System.out.println("Matdas                              " +nilai[0][3]+ "               " +nilai[1][3]+ "               " +nilaiHuruf[3]);
        System.out.println("B. Inggris 1                        " +nilai[0][4]+ "               " +nilai[1][4]+ "               " +nilaiHuruf[0]);
        System.out.println("DasPro                              " +nilai[0][5]+ "               " +nilai[1][5]+ "               " +nilaiHuruf[5]);
        System.out.println("Praktikum DasPro                    " +nilai[0][6]+ "               " +nilai[1][6]+ "               " +nilaiHuruf[6]);
        System.out.println("K3                                  " +nilai[0][7]+ "               " +nilai[1][7]+ "               " +nilaiHuruf[7]);
        System.out.println("=======================");
        System.out.println("IP: " +ip);
    }
}
