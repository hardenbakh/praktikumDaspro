package Jobshhet06;

import java.util.Scanner;

public class Latihan6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biaya_tetap = 50000;
        double ppn = 0.1;
        double tarif = 0;
        double pemakaian_kwh, biaya_kwh, total_biaya, pajak;
        int daya;

         System.out.println("Masukkan opsi daya (900/1300/2200/3500/5500 VA):");
        daya = sc.nextInt();

        System.out.println("Masukkan jumlah pemakaian kWh:");
        pemakaian_kwh = sc.nextDouble();

        //  Tambahkan input untuk opsi daya. Tarif listrik per-kWh akan bergantung pada 
        // daya yang dipilih, yaitu Rp 1.300/kWh untuk daya 900 VA, Rp 1.500/kWh untuk daya 
        // 1.300 VA dan 2.200 VA, serta Rp 1.700/kWh untuk daya 3.500 dan 5.500 VA. Gunakan IF
        // ELSE.

        switch (daya) {
            case 900:
                tarif = 1300; 
                break;
             case 1300:
                tarif = 1500; 
                break;
             case 2200:
                tarif = 1500; 
                break;
             case 3500:
                tarif = 1700; 
                break;
             case 5500:
                tarif = 1700; 
                break;
        
            default:
                break;
        }
         biaya_kwh = tarif * pemakaian_kwh;
        pajak = (biaya_tetap + biaya_kwh) * ppn;
        total_biaya = biaya_tetap + biaya_kwh + pajak;

        System.out.println("Total biaya listrik: Rp " + total_biaya);
        }
    }
