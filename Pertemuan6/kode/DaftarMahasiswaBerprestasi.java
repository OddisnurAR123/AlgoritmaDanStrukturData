public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa [5];
    int idx;

    // Setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] =m;
            idx++;
        } else{
            System.out.println(" Data sudah penuh!!!");
        }
    }

    // Setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }
    
    // Setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    // Setelah ini tuliskan method selectionSort()
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }

            // Swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}