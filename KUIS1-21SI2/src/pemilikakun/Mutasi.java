package pemilikakun;

public class Mutasi {
    public int jumlahUang;
    public String nomorRekening;
    
    public Mutasi(int jumlahUang, String nomorRekening) {
        this.jumlahUang = jumlahUang;
        this.nomorRekening = nomorRekening;
    }

    public void tampilMutasi() {
        System.out.println(nomorRekening + "\t\t\t" + jumlahUang + "\t\t\t" + "Debit");
    }
}
