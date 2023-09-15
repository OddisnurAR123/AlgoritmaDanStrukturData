import java.util.Scanner;
public class MainSum {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        Sum[] sm = new Sum[numCompanies];

        for (int i = 0; i < numCompanies; i++) {
            System.out.println("=============================================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);

            for (int j = 0; j < sm[i].elemen; j++){
                System.out.print("Masukkan keuntungan bulan ke - " + (j+1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }
        
        System.out.println("================================================================");
        System.out.println("Total keuntungan perusahaan:");

        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan, 2));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1, 2));
        }
    }
}
