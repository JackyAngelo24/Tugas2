import pemilikakun.*;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Akun> dataAkun = new ArrayList<Akun>();
        dataAkun.add(new Akun("Susi", "0213456"));
        dataAkun.add(new Akun("Budi", "0314865"));

        Scanner keyboard = new Scanner(System.in);
        Program.clearscreen();
        System.out.println("Selamat datang!");
        Program.sleep(2000);

        do {
            String input;
            Program.clearscreen();
            System.out.println("Menu:");
            System.out.println("1. Transfer");
            System.out.println("2. Cek Mutasi");
            System.out.println("3. Keluar");
            System.out.print("Silahkan masukkan pilihan Anda: ");
            input = keyboard.nextLine();

            if(input.equals("1")) {
                Program.clearscreen();
                int Idx = 0;
                do {
                    Program.clearscreen();
                    System.out.println("Transfer Uang");
                    System.out.println("--------------");
                    System.out.print("Masukkan rekening Anda (Angka): ");
                    String rekPemilik = keyboard.nextLine();
                    boolean Ketemu = false;
                    for (Akun akun : dataAkun) {
                        if (rekPemilik.equals(akun.nomorRekening)) {
                            Ketemu = true;
                            break;
                        }
                        Idx++;
                    }
                    
                    if (Ketemu == true) {
                        break;
                        }
                    else {
                        System.out.println("\nRekening yang Anda masukkan tidak terdaftar!");
                        Program.sleep(2000);
                    }
                } while(true); 
                
                System.out.print("\nSilahkan masukkan nomor rekening tujuan: ");
                String noRekTujuan = keyboard.nextLine();

                boolean ketemu = false;
                int index=0;
                for (Akun akun : dataAkun) {
                    if (noRekTujuan.equals(akun.nomorRekening)) {
                        ketemu = true;
                        break;
                    }
                    index++;
                }

                if (ketemu == true) {
                    System.out.print("\nSilahkan masukkan jumlah uang yang ingin ditransfer: ");
                    int uang = keyboard.nextInt();
                    if (dataAkun.get(Idx).cekSaldo(uang) == true) {
                        dataAkun.get(Idx).transferUang(uang);
                        System.out.println("\nAnda telah mengirim Rp." + uang + " kepada akun dengan No.rek " + dataAkun.get(index).nomorRekening + " atas nama " + dataAkun.get(index).namaPemilik);
                        dataAkun.get(Idx).mutasi.add(new Mutasi(uang, dataAkun.get(index).nomorRekening));
                        Program.sleep(5000);
                    }
                    else {
                        System.out.println("\nSaldo akun Anda tidak cukup!");
                        Program.sleep(2000);
                    }
                }
                else {
                    System.out.println("\nNomor Rekening yang dimasukkan invalid!");
                    Program.sleep(2000);
                }
            }

            else if (input.equals("2")) {
                Program.clearscreen();
                System.out.println("Cek Mutasi");
                System.out.println("----------");
                System.out.print("Silahkan masukkan nomor rekening Anda: ");
                String rekPemilik = keyboard.nextLine();
                boolean temu = false;
                for (Akun akun : dataAkun) {
                    if (rekPemilik.equals(akun.nomorRekening)) {
                        temu = true;
                    }
                }

                if (temu == true) {
                    int idx = Program.getIndexDataAkun(rekPemilik, dataAkun);
                    int t = (dataAkun.get(idx).mutasi.size());
                    if (t >= 1) {
                        System.out.println("\nNomor Rekening\t\tJumlah Uang\t\tMutasi");
                        System.out.println("--------------\t\t-----------\t\t------");
                        dataAkun.get(idx).tampilMutasiAkun();
                        Program.sleep(t*2500);
                    }
                    else {
                        Program.sleep(2000);
                    }
                }
                else {
                    System.out.println("\nNomor rekening yang Anda input invalid!");
                    Program.sleep(2000);
                }
            }

            else if (input.equals("3")) {
                break;
            }

            else {
                System.out.println("\nInput harus berupa angka 1-3");
                Program.sleep(2000);
            }

        } while (true);

        keyboard.close();
        Program.clearscreen();
        System.out.println("\nTerima kasih telah menggunakan layanan kami\n");
    } 
}
