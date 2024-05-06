package Jobsheet6;

public class coba {
    int elm;
    public int input, data[];
    public int cari;

    coba (int i, int c) {
        input = i;
        cari = c;
    }

    int[] pecah() {
        elm = (int) Math.log10(input)+1;
        data = new int[elm];
        int temp = input;
        for (int i = 0; i < elm; i++) {
            data[i] = temp%10;
            temp /= 10;
        }
        return data;
    }

    int insertionShort() {
        data = pecah();
        for (int i = 0; i < data.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j]<data[idxMin]) {
                    idxMin = j;
                }
            }
            int tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }
        return cariData(data, 0, elm);
    }

    int cariData(int arr[], int l, int r) {
        int mid = (l+r)/2;
        if (cari==arr[mid]) {
            return mid;
        }if (l==r) {
            return -1;
        }else if (cari<arr[mid]) {
            int lsum = cariData(arr, l, mid-1);
            return lsum;
        }else {
            int rsum = cariData(arr, mid+1, r);
            return rsum;
        }
    }
}
