package Jobsheet8.Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size==max) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size==0) {
            return true;
        }else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian pada posisi depan: " + antrian[front].nama + " " + antrian[front].noHp);
        }else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian pada posisi belakang: " + antrian[rear].nama + " " + antrian[rear].noHp);
        }else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i+1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen: " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void Enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        }else {
            if (isEmpty()) {
                front = rear = 0;
            }else {
                if (rear == max-1) {
                    rear = 0;
                }else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else {
                if (front == max-1) {
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekPosition(String n) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                if (antrian[i].nama.equalsIgnoreCase(n)) {
                    System.out.println(antrian[i].nama + " ada di antrian ke-" +(i+1));
                }
                i = (i+1) % max;
            }
        }
    }
}
