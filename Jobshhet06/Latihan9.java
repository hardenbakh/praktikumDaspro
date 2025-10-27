package Jobshhet06;

import java.util.Scanner;
public class Latihan9 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          double perHalaman, jilid, berat, beratHC, beratKemasan, ongkir, TOTALBIAYA, TotalOngkir, totalBerat, TotalCetak;
        int jumlah_halaman;

        perHalaman = 200;
        jilid = 20000;
        berat = 0.003;
        beratHC = 0.250;
        beratKemasan = 0.300;
        ongkir = 15000;
        double ongkirMalang = 20000;


        System.out.println("Masukkan jumlah halaman:");
        jumlah_halaman = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan nama kota Anda");
        String Kota = sc.nextLine(); 


        TotalCetak = (perHalaman * jumlah_halaman) + jilid;
        totalBerat = (jumlah_halaman * berat) + beratHC + beratKemasan;
        
        if (Kota.equalsIgnoreCase("Malang") || Kota.equalsIgnoreCase("Batu")) {
            TotalOngkir = ongkirMalang;
        } else {
            TotalOngkir = (Math.ceil(totalBerat) * ongkir);
        }
        

        TOTALBIAYA = TotalOngkir + TotalCetak;

        System.out.println("Total biaya adalah Rp. " + TOTALBIAYA);
    }
}
