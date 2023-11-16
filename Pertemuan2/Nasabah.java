import java.util.Scanner;

public class Nasabah {
    private int id;
    private String nama;
    private String alamat;
    private int noHP;
    private int[] noRek;
    private int[] saldo;
    private float jmlHutang;
    private boolean statusAktif;

    public Nasabah(String nama, String alamat, int id) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = 0;
        this.noRek = new int[5];
        this.saldo = new int[5];
        this.jmlHutang = 0;
        this.statusAktif = false;
    }

    public int lihatSaldo(int noRek) {
        for (int i = 0; i < this.noRek.length; i++) {
            if (this.noRek[i] == noRek) {
                return saldo[i];
            }
        }
        return -1;
    }

    public int menabung(int noRek, int deposit) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    if (deposit > 0) {
                        saldo[i] += deposit;
                        return saldo[i];
                    } else {
                        System.out.println("Jumlah yang dimasukkan harus lebih dari 0.");
                        return saldo[i];
                    }
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1;
    }

    public int tarikTunai(int noRek, int jmlTarik) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    if (saldo[i] >= jmlTarik) {
                        saldo[i] -= jmlTarik;
                        return saldo[i];
                    } else {
                        System.out.println("Saldo tidak mencukupi untuk melakukan penarikan.");
                        return saldo[i];
                    }
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1;
    }

    public void bukaRekening() {
        if (!statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == 0) {
                    this.noRek[i] = (int) (Math.random() * 1000000);
                    this.saldo[i] = 0;
                    this.statusAktif = true;
                    System.out.println("Rekening berhasil dibuka. Nomor rekening Anda: " + this.noRek[i]);
                    return;
                }
            }
            System.out.println("Anda sudah memiliki 5 rekening aktif.");
        } else {
            System.out.println("Anda sudah memiliki rekening aktif.");
        }
    }
    
    public void tutupRekening(int noRek) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    this.noRek[i] = 0;
                    this.saldo[i] = 0;
                    this.statusAktif = false;
                    System.out.println("Rekening berhasil ditutup.");
                    return;
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
    }

    public void berhutang(float jmlHutang) {
        if (statusAktif) {
            if (jmlHutang >= saldo[0]) {
                System.out.println("Ajuan peminjaman ditolak. Jumlah hutang melebihi saldo.");
            } else {
                this.jmlHutang = jmlHutang;
                float cicilanPerBulan = (float) jmlHutang / 6;
                System.out.println("Pinjaman disetujui.");
                System.out.println("Simulasi skema cicilan per bulan: " + cicilanPerBulan);
            }
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
    }

    public int getNoRek(int index) {
        if (index >= 0 && index < this.noRek.length) {
            return this.noRek[index];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_NASABAH = 5;

        Nasabah[] nasabahArray = new Nasabah[MAX_NASABAH];

        int jumlahNasabah = 0;

        boolean isExit = false;

        while (!isExit) {
            System.out.println("===========MENU==============================================");
            System.out.println("1. Buka Rekening");
            System.out.println("2. Lihat Saldo");
            System.out.println("3. Menabung");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Berhutang");
            System.out.println("6. Tutup Rekening");
            System.out.println("7. Keluar");
            System.out.print("Pilih tindakan (1-7): ");
            int choice = sc.nextInt();
            System.out.println("=============================================================");

            switch (choice) {
                case 1:
                    if (jumlahNasabah < MAX_NASABAH) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.next();
                        System.out.print("Masukkan alamat: ");
                        String alamat = sc.next();
                        System.out.print("Masukkan nomor HP: ");
                        int noHP = sc.nextInt();

                        Nasabah nasabahBaru = new Nasabah(nama, alamat, noHP);
                        nasabahBaru.bukaRekening();
                        nasabahArray[jumlahNasabah] = nasabahBaru;

                        jumlahNasabah++;
                    } else {
                        System.out.println("Kapasitas maksimum nasabah telah tercapai.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekLihatSaldo = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].lihatSaldo(noRekLihatSaldo);
                        if (saldo >= 0) {
                            System.out.println("Saldo Anda: " + saldo);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekMenabung = sc.nextInt();
                    boolean foundMenabung = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].menabung(noRekMenabung, 0);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah yang ingin ditabung: ");
                            int deposit = sc.nextInt();
                            int saldoBaru = nasabahArray[i].menabung(noRekMenabung, deposit);
                            if (saldoBaru >= 0) {
                                System.out.println("Penabungan berhasil. Saldo Anda sekarang: " + saldoBaru);
                            }
                            foundMenabung = true;
                            break;
                        }
                    }
                    if (!foundMenabung) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTarikTunai = sc.nextInt();
                    boolean foundTarikTunai = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].tarikTunai(noRekTarikTunai, 0);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah yang ingin ditarik: ");
                            int withdrawal = sc.nextInt();
                            int saldoBaru = nasabahArray[i].tarikTunai(noRekTarikTunai, withdrawal);
                            if (saldoBaru >= 0) {
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + saldoBaru);
                            }
                            foundTarikTunai = true;
                            break;
                        }
                    }
                    
                    if (!foundTarikTunai) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekBerhutang = sc.nextInt();
                    boolean foundBerhutang = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].lihatSaldo(noRekBerhutang);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah hutang: ");
                            float hutang = sc.nextFloat();
                            nasabahArray[i].berhutang(hutang);
                            foundBerhutang = true;
                            break;
                        }
                    }
                    
                    if (!foundBerhutang) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTutup = sc.nextInt();
                    boolean foundTutup = false;

                    for (int i = 0; i < jumlahNasabah; i++) {
                        nasabahArray[i].tutupRekening(noRekTutup);
                        foundTutup = true;
                        break; 
                    }

                    if (!foundTutup) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        }
    }
}