package pemilikakun;

import java.util.ArrayList;

public class Program {
    
    public static void clearscreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {}
    }

    public static int getIndexDataAkun(String nomorRekening, ArrayList<Akun> dataAkun) {
        int index=0;
        for (Akun akun : dataAkun) {
            if (nomorRekening.equals(akun.nomorRekening)) {
                break;
            }
            index++;
        }
        return index;
    }
}
