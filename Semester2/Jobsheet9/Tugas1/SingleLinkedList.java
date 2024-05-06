package Jobsheet9.Tugas1;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head; 
            System.out.println("Isi Linked List ");
            int i = 1;
            while (tmp != null) {
                System.out.println("Antrian mahasiswa ke-" +i);
                System.out.println("NIM: " +tmp.nim);
                System.out.println("Nama: " +tmp.nama);
                tmp = tmp.next; 
                i++;
            }
            System.out.println("=======================");
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    

    void addFirst(int nim, String nama){
        Node ndInput = new Node(nim, nama, null);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int nim, String nama){
        Node ndInput = new Node(nim, nama, null);

        if (isEmpty()) {
            head = ndInput;
            tail  = ndInput;
            
        }else{
            tail.next = ndInput;
            tail = ndInput;  
        }
    }

    void insertAfter(int key, int nim, String nama){
        Node ndInput = new Node(nim, nama, null);
        Node temp = head;
        while (temp != null) {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node dengan kunci " + key + " tidak ditemukan dalam linked list");
        }
    }

    void insertAt(int index, int nim, String nama){
        Node ndInput = new Node(nim, nama, null);
        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            ndInput.next = temp.next; 
            temp.next = ndInput;
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index == 0) {
            addFirst(nim, nama);
        }else if (index == -1) {
            System.out.println("Linked List masih kosong");
        }
    }
}