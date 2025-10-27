package Jobshhet06;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sewa_mobil, sewa_sopir, totalBiaya, total_bbm;
       

        int total_km, lama_sewa;
        sewa_mobil = 300000;
        sewa_sopir = 200000;

        System.out.println("Masukkan lama sewa (dalam hari):");
        lama_sewa = sc.nextInt();

        // lama sewa tidak boleh lebih dari 30 hari

         if (lama_sewa > 30 ) {
            System.out.println("lama sewa tidak boleh melebihi 30 hari");
            return;
       }         
        System.out.println("Masukkan total km (dalam km):");
        total_km = sc.nextInt();

        // jenis bahan bakar pertalite dan pertamax

         double pertamax, pertalite;

        pertamax = 1300;
        pertalite = 1000;

        System.out.println("Masukkan jenis BBM anda (pertalite/pertamax):");
        String jenisBBM = sc.next();

        if (jenisBBM.equals("pertamax")) {
            total_bbm = pertamax * total_km;
            System.out.println("Biaya BBM dengan Pertamax: Rp." + total_bbm);
        } else if (jenisBBM.equals("pertalite")) {
            total_bbm = pertalite * total_km;
            System.out.println("Biaya BBM dengan Pertalite: Rp." + total_bbm);
        } else {
            total_bbm = 0;
            System.out.println("Jenis BBM tidak dikenali.");
        }
        

        //diskon jika lebih dari Rp. 2.000.000,00
        totalBiaya = (sewa_mobil + sewa_sopir) * lama_sewa;

        double diskon;
        diskon = 0.05;
        if (totalBiaya > 2000000) {
            totalBiaya= totalBiaya - (totalBiaya * diskon);
            System.out.println("anda mendapat diskon 5% sehingga total biaya menjadi : " + totalBiaya);
        } else {
            System.out.println("Total biaya anda : " + totalBiaya);
        }
        
    }
}
