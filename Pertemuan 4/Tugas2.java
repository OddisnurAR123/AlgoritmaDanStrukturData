public class Tugas2 {
    private String[][] dataMahasiswa;

    public Tugas2(String[][] data) {
        dataMahasiswa = data;
    }

    public void cariMahasiswa(String namaCari) {
        boolean ditemukan = false;
        int kelompok = -1;
        int urutan = -1;
        int i = 0;

        while (!ditemukan && i < dataMahasiswa.length) {
            int j = 0;
            while (!ditemukan && j < dataMahasiswa[i].length) {
                if (namaCari.equalsIgnoreCase(dataMahasiswa[i][j])) {
                    kelompok = i + 1;
                    urutan = j + 1;
                    ditemukan = true;
                }
                j++;
            }
            i++;
        }

        if (ditemukan) {
            System.out.println("Mahasiswa bernama " + namaCari + " berada pada Kelompok ke-" + kelompok + " dan Urutan ke-" + urutan + " dalam Kelompok");
        } else {
            System.out.println("Mahasiswa bernama " + namaCari + " tidak ditemukan.");
        }
    }
}