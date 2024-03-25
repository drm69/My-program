package Jobsheet5.LatihanPraktikum;

public class HotelService {
    Hotel listHotel[] = new Hotel[5];
    int idx;

    void tambah(Hotel h) {
        if (idx<listHotel.length) {
            listHotel[idx] = h;
            idx++;
        }else {
            System.out.println("Data sudah penuh!!");
        }
    }


    void tampilAll() {
        for (Hotel h : listHotel) {
            h.tampilAll();
            System.out.println("__________________");
        }
    }

    void bubbleShort() {
        for (int i = 0; i < listHotel.length-1; i++) {
            for (int j = 1; j < listHotel.length-i; j++) {
                if (listHotel[j].harga>listHotel[j-1].harga) {
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionShort() {
        for (int i = 0; i < listHotel.length-1; i++) {
            int index = i;
            for (int j = i+1; j < listHotel.length; j++) {
                if (listHotel[j].bintang>listHotel[index].bintang) {
                    index = j;
                }
            }
            Hotel tmp = listHotel[index];
            listHotel[index] = listHotel[i];
            listHotel[i] = tmp;
        }
    } 
}
