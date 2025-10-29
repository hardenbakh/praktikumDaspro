package Jobsheet07;

import java.util.Scanner;
public class Bioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
       double totalTiket=0;
       double totalPenjualan=0;

        System.out.println("ketik 0 jika ingin mengakhiri input");

        do{
            System.out.println("masukkan jumlah tiket anda");
            int jmlTiket = sc.nextInt();

            if (jmlTiket ==0) {
                System.out.println("input selesai");
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("jumlah tiket tidak valid(negatif) ");
                continue;
          }
          double totalHarga = jmlTiket * hargaTiket;
          double diskon = 0;

          if (jmlTiket >=4) {
            diskon = 0.10;
          }
          if (jmlTiket >=10) {
            diskon = 0.15;
          }

          totalHarga = totalHarga - (totalHarga * diskon);

          System.out.println("total harga tiket anda adalah" + totalHarga);

          totalTiket += jmlTiket;
            totalPenjualan += totalHarga;

            System.out.println("jumlah tiket anda adalah " + jmlTiket);
            System.out.println("total penjualan per hari " + totalPenjualan);
        } while (true);
        

    }
    
}
