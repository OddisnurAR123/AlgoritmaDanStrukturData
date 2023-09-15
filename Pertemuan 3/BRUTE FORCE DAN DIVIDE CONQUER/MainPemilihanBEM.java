import java.util.Scanner;

public class MainPemilihanBEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println(">>>>>       Pemilihan BEM       <<<<<");
        System.out.println("=====================================");
        System.out.print("Masukkan Jumlah Suara : ");
        int jumlahSuara = sc.nextInt();
        System.out.println("=====================================");

        String[] suaraKandidat = new String[jumlahSuara];

        System.out.println("Masukkan suara untuk setiap kandidat: ");
        for (int i = 0; i < jumlahSuara; i++) {
            System.out.print("Suara ke-" + (i + 1) + ": ");
            suaraKandidat[i] = sc.next();
        }

        String hasil = cariMayoritas(suaraKandidat);

        if (!hasil.equals("No Mayoritas")) {
            System.out.println("Kandidat " + hasil + " memiliki mayoritas suara.");
        } else {
            System.out.println("Tidak ada kandidat yang memiliki mayoritas suara.");
        }
    }

    static String cariMayoritas(String[] suaraKandidat) {
        int n = suaraKandidat.length;
        String kandidat = null;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                kandidat = suaraKandidat[i];
                count = 1;
            } else if (kandidat.equals(suaraKandidat[i])) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (suaraKandidat[i].equals(kandidat)) {
                count++;
            }
        }

        if (count > n / 2) {
            return kandidat;
        } else {
            return "No Mayoritas";
        }
    }
}