package Jobshhet06;
import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


          double sewa_mobil, sewa_sopir, bbm , totalBiaya, total_bbm ;
            int total_hari, total_km, lama_sewa ;
            sewa_mobil=300000;
            sewa_sopir=200000;
            bbm=1000;

            System.out.println("masukkan lama sewa (dalam hari)");
            lama_sewa =sc.nextInt();
             // lama sewa tidak boleh lebih dari 30 hari

         if (lama_sewa > 30 ) {
            System.out.println("lama sewa tidak boleh melebihi 30 hari");
            return;
       }         
        
            System.out.println("masukkan total km (dalam km)");
            total_km = sc.nextInt();

            totalBiaya= (sewa_mobil + sewa_sopir) * lama_sewa;
            total_bbm= bbm * total_km;

            System.out.println("total biaya Rp." + totalBiaya);
            System.out.println("total bbm Rp." + total_bbm);

        }
    }
