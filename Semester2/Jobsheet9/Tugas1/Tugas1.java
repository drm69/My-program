package Jobsheet9.Tugas1;

public class Tugas1 {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addFirst(112, "Prita");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.insertAfter(112, 113, "Yusuf");
        singLL.print();
        singLL.insertAt(3, 114, "Doni");
        singLL.print();
    }
}
