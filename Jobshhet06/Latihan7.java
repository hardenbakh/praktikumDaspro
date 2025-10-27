package Jobshhet06;

import java.util.Scanner;

public class Latihan7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double publikasi, dekorasi, konsumsiPST,hadiah, biaya_OPR, konsumsiPNT, honor ;
        double Pendaftaran, danaSponsor, danaTotal, TotalBiaya, danapoli;
        int tim;
        publikasi=300000;
        dekorasi=500000;
        konsumsiPNT=500000;
        biaya_OPR=500000;
        hadiah=4000000;
        honor=75000;
        konsumsiPST=75000;
        Pendaftaran=50000;

        System.out.println("masukkan jumlah tim");
        tim= sc.nextInt();
        // biaya keseluruhan
         TotalBiaya=(dekorasi+publikasi+konsumsiPNT+hadiah) +( honor*tim)+(konsumsiPST*tim)+biaya_OPR;

         //dana bantuan
        System.out.println("Apakah Polinema bersedia memberikan bantuan? (iya/tidak)");
        String memberiBantuan = sc.next();

        if (memberiBantuan.equalsIgnoreCase("iya")) {
            System.out.println("dana bantuan dalam persentase (%)");
            double DanaBantuan = sc.nextDouble();
            
            if (DanaBantuan < 0 || DanaBantuan > 100) {
             System.out.println("Persentase bantuan harus antara 0 - 100%");
             return;
        }

            danapoli = TotalBiaya * (DanaBantuan /100);
        } else {
            danapoli=0;
        }

        
        double danaPendaftaran = Pendaftaran * tim;
        double totalDana = danapoli + danaPendaftaran;

        // pengecekan perlu tidaknya dana sponsor
        if (totalDana >= TotalBiaya) {
            System.out.println("Dana sponsor tidak diperlukan. Dana sudah mencukupi.");
        } else {
            double DanaSponsor = TotalBiaya - totalDana;
            System.out.println("Dana sponsor yang dibutuhkan: Rp " + (int)DanaSponsor);
        }

       
    }
}

