import java.util.Scanner;
import bangunruang.LimasSegiempat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Program untuk menghitung volume dari Limas Segiempat!");
        System.out.println("-----------------------------------------------------");
        System.out.print("Masukkan panjang sisi alas (cm) limas segiempat = ");
        Scanner Input = new Scanner(System.in);
        int A = Input.nextInt();
        System.out.print("Masukkan tinggi (cm) limas segiempat = ");
        Scanner Input1 = new Scanner(System.in);
        int B = Input1.nextInt();

        LimasSegiempat Ruang = new LimasSegiempat(A, B);
        Ruang.tampilkanVolumeLimas();

        Input.close();
        Input1.close();
    }
}
