public class PengurutanBuku {
    Buku[] listBuku = new Buku[4];
    int idx;

    void tambah(Buku buku) {
        if (idx < listBuku.length) {
            listBuku[idx] = buku;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }

    void tampil() {
        for (Buku buku : listBuku) {
            buku.tampil();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 0; j < listBuku.length - i - 1; j++) {
                if (listBuku[j].tinggiBuku > listBuku[j + 1].tinggiBuku) {
                    Buku temp = listBuku[j];
                    listBuku[j] = listBuku[j + 1];
                    listBuku[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listBuku.length; j++) {
                if (listBuku[j].jumlahHalaman < listBuku[minIndex].jumlahHalaman) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Buku temp = listBuku[i];
                listBuku[i] = listBuku[minIndex];
                listBuku[minIndex] = temp;
            }
        }
    }
}
