package Jobshhet06;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biaya_tetap = 50000;
        double ppn = 0.1;
        double tarif = 0;
        double pemakaian_kwh, biaya_kwh, total_biaya, daya, pajak;

        System.out.println("Masukkan opsi daya (900/1300/2200/3500/5500 VA):");
        daya = sc.nextDouble();

        System.out.println("Masukkan jumlah pemakaian kWh:");
        pemakaian_kwh = sc.nextDouble();

        if (daya == 900) {
            tarif = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarif = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarif = 1700;
        } else {
            System.out.println("Daya tidak valid!");
            return;  
        }

    
        biaya_kwh = tarif * pemakaian_kwh;
        pajak = (biaya_tetap + biaya_kwh) * ppn;
        total_biaya = biaya_tetap + biaya_kwh + pajak;

        System.out.println("Total biaya listrik: Rp " + total_biaya);

    }
}
