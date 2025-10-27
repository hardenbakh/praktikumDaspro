package Jobshhet06;

import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double perHalaman = 200;
        double beratHalaman = 0.003; 
        double beratCover, beratKemasan = 0.300; 
        double ongkir = 15000;
        double biayaCover, totalBerat, totalCetak, totalOngkir, totalBiaya;
        int jumlahHalaman;
        String jenisCover;

        System.out.print("Masukkan jumlah halaman: ");
        jumlahHalaman = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan jenis cover (hard/soft): ");
        jenisCover = sc.nextLine().toLowerCase();

    
        if (jenisCover.equals("hard")) {
            biayaCover = 20000;
            beratCover = 0.250;
        } else if (jenisCover.equals("soft")) {
            biayaCover = 10000;
            beratCover = 0.100;
        } else {
            System.out.println("Jenis cover tidak valid! Gunakan 'hard' atau 'soft'.");
            return;
        }

        
        totalCetak = (perHalaman * jumlahHalaman) + biayaCover;
        totalBerat = (jumlahHalaman * beratHalaman) + beratCover + beratKemasan;
        totalOngkir = Math.ceil(totalBerat) * ongkir;
        totalBiaya = totalCetak + totalOngkir;

        System.out.println("Total biaya adalah Rp. " + totalBiaya);
    }
    
}
