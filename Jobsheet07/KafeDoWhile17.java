package Jobsheet07;
import java.util.Scanner;
public class KafeDoWhile17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi, hargaTeh, hargaRoti;
        int totalHarga;
        String namaPelanggan;

        hargaKopi = 12000;
        hargaTeh = 7000;
        hargaRoti = 20000;

        do {

            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("jumlah kopi ");
            kopi = sc.nextInt();
            System.out.println("jumlah teh");
            teh = sc.nextInt();
            System.out.println("masukkan jumlah roti");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar : Rp " + totalHarga);
            
        } while (true);
    }
}
