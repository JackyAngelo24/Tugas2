package pemilikakun;

import java.util.ArrayList;

public class Akun {
    public int saldo = 500000;
    public String namaPemilik;
    public String nomorRekening;
    public ArrayList<Mutasi> mutasi = new ArrayList<Mutasi>();

    public Akun(String namaPemilik, String nomorRekening) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
    }

    public boolean cekSaldo(int jumlahUang) {
        if (saldo >= jumlahUang) {
            return true;
        }
        else {
            return false;
        }
    }

    public void transferUang(int jumlahUang) {
        if (cekSaldo(jumlahUang) == true) {
            saldo-=jumlahUang;
        }
    }

    public void tampilMutasiAkun() {
        if (mutasi.size() >= 1) {
            for (Mutasi mutasi2 : mutasi) {
                mutasi2.tampilMutasi();
            }
        }
        else {
            System.out.println("\nTidak ada mutasi yang ditemukan!");
        }
    }
}
