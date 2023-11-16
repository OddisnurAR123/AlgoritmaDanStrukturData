public class DaftarAnggotaPaskibraka {
    Paskibraka[] listPeserta = new Paskibraka[10];
    int id;

    void tambah(Paskibraka m) {
        if (id < listPeserta.length) {
            listPeserta[id] = m;
            id++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }

    void tampil() {
        for (Paskibraka peserta : listPeserta) {
            if (peserta != null) {
                peserta.tampil();
                System.out.println("-----------------------------");
            }
        }
    }

    void sorting() {
        for (int i = 0; i < id - 1; i++) {
            for (int j = 0; j < id - i - 1; j++) {
                if (listPeserta[j].tinggi < listPeserta[j + 1].tinggi) {
                    Paskibraka temp = listPeserta[j];
                    listPeserta[j] = listPeserta[j + 1];
                    listPeserta[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (Paskibraka peserta : listPeserta) {
            if (peserta != null && peserta.tinggi >= 170) {
                peserta.tampil();
                System.out.println("-----------------------------");
            }
        }
    }
    
}
