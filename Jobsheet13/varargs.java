package Jobsheet13;

public class varargs {
    public static void main(String[] args) {
        data("Tipe data pertama(int)", 1, 2, 3, 4);
        data("Tipe data kedua(String)", "babi", "Anjing", "Singa");
    }

    public static void data(String Keterangan, Object... a) {
        System.out.println(Keterangan);
        for (Object x : a) {
            System.out.print(x +" ");
        }
        System.out.println();
    }
}
