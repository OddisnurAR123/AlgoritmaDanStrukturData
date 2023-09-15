public class PemilihanBEM {
    public int jumlahSuara;
    public String namaKandidat[];
    
    public PemilihanBEM(int jumSuara) {
        this.jumlahSuara = jumSuara;
        this.namaKandidat = new String[jumlahSuara];
    }    
    
    String hasilMayoritas(String arr[], int l , int r){
        if(l==r){
            return arr[1];
        } else if(1 < r){
            int mid = (1+r)/2;
            String mayoritasL = hasilMayoritas(arr, 1, mid);
            String mayoritasR = hasilMayoritas(arr, mid+1, r);
            
            if (mayoritasL==null&&mayoritasR!="No Mayoritas"){
                return mayoritasR;
            }
            else if (mayoritasL!="No Mayoritas"&&mayoritasR==null){
                return mayoritasR;
            }
            else if (mayoritasL.equals(mayoritasR)){
                return mayoritasL;
            }
            else if (mayoritasL=="No Mayoritas"&&mayoritasR=="No Mayoritas"){
                return "No Mayoritas";
            }
            else if (mayoritasL!="No Mayoritas"&&mayoritasR=="No Mayoritas"){
                return mayoritasL;
            }
            else if (mayoritasL=="No Mayoritas"&&mayoritasR!="No Mayoritas"){
                return mayoritasR;
            }
            else if (mayoritasL!=mayoritasR){
                return "No Mayoritas";
            }
        }
        return null;
    }
    
}
