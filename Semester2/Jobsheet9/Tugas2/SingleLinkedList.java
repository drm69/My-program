package Jobsheet9.Tugas2;

public class SingleLinkedList {
    Mhs head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Mhs tmp = head; 
            System.out.println("Berikut list antrian saat ini: ");
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
            System.out.println("Antrian Kosong");
        }
    }

    void addLast(int nim, String nama){
        Mhs ndInput = new Mhs(nim, nama, null);

        if (isEmpty()) {
            head = ndInput;
            tail  = ndInput;
            
        }else{
            tail.next = ndInput;
            tail = ndInput;  
        }
        System.out.println(nama+ " Berhasil ditambahkan ke dalam antrian!!");
    }

    String getData(int index){
        Mhs tmp = head;
        for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }
        return tmp.nama;
    }

    int indexOf(int key){
        Mhs tmp = head;
        int index = 0;
        while (tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }else{
            return index+1;
        }
    }

    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, Tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    void remove(String key){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, Tidak dapat dihapus"); 
        } else {
            Mhs temp =head;
            while (temp!=null) {
                if (temp.nama != key && temp == head) {
                    removeFirst();
                    break;
                }else if (temp.next.nama == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
}