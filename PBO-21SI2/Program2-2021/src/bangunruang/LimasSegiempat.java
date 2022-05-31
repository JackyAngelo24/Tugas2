package bangunruang;

public class LimasSegiempat {
    int SisiAlas=0, Tinggi=0, Volume=0;
        
    public LimasSegiempat(int SisiAlas, int Tinggi) {
        this.SisiAlas = SisiAlas;
        this.Tinggi = Tinggi;
    }
    
    public void hitungVolumeLimas() {
        Volume = SisiAlas * SisiAlas * Tinggi;
    }
    
    public void tampilkanVolumeLimas() {
        hitungVolumeLimas();
        System.out.println("Volume dari Limas Segiempat (sisi alas = " + SisiAlas + "cm dan tinggi = " + Tinggi +  "cm) = " + Volume + " cm3");;
    }
}
