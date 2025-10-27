package Jobshhet06;
import java.util.Scanner;
public class Latihan1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          double sewa_mobil, sewa_sopir, totalBiaya, total_bbm ;
            int total_hari, total_km, lama_sewa ;
            sewa_mobil=300000;
            sewa_sopir=200000;

            System.out.println("masukkan lama sewa (dalam hari)");
            lama_sewa =sc.nextInt();
            System.out.println("masukkan total km (dalam km)");
            total_km = sc.nextInt();

                // jenis bahan bakar pertalite dan pertamax

         double pertamax, pertalite;

        pertamax = 1300;
        pertalite = 1000;
        
        System.out.println("Masukkan jenis BBM anda (pertalite/pertamax):");
        String jenisBBM = sc.next();

        if (jenisBBM.equalsIgnoreCase("pertamax")) {
            total_bbm = pertamax * total_km;
            System.out.println("Biaya BBM dengan Pertamax: Rp." + total_bbm);
        } else if (jenisBBM.equalsIgnoreCase("pertalite")) {
            total_bbm = pertalite * total_km;
            System.out.println("Biaya BBM dengan Pertalite: Rp." + total_bbm);
        } else {
            total_bbm = 0;
            System.out.println("Jenis BBM tidak dikenali.");
        }
        totalBiaya = (sewa_mobil + sewa_sopir) * lama_sewa;


            System.out.println("total biaya Rp." + totalBiaya);
            System.out.println("total bbm Rp." + total_bbm);

        }
}