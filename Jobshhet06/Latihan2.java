package Jobshhet06;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

          double sewa_mobil, sewa_sopir, bbm , totalBiaya, total_bbm ;
            int total_hari, total_km, lama_sewa ;
            sewa_mobil=300000;
            sewa_sopir=200000;
            bbm=1000;

            System.out.println("masukkan lama sewa (dalam hari)");
            lama_sewa =sc.nextInt();
            System.out.println("masukkan total km (dalam km)");
            total_km = sc.nextInt();

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
            total_bbm= bbm * total_km;


            System.out.println("total biaya Rp." + totalBiaya);
            System.out.println("total bbm Rp." + total_bbm);

        }
    }

    