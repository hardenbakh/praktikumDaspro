package Jobsheet09;
import java.util.Scanner;
public class ArrayRataNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int JumlahMhs = sc.nextInt();

        int [] nilaiMhs = new int[JumlahMhs];

        int totalLulus = 0, totalTidakLulus = 0;
        int JumlahLulus = 0, JumlahTidakLulus = 0;
        double rata2lulus, rata2tidakLulus;

        int max= 0;
        int min= 100;


        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                JumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                JumlahTidakLulus++;
            }
             
            if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
            if (nilaiMhs[i]< min) {
                min = nilaiMhs[i];
            }
        }
        
        
        rata2lulus = totalLulus/ JumlahLulus;
        rata2tidakLulus = totalTidakLulus / JumlahTidakLulus;

        System.out.println("Rata2 mahasiswa yang lulus: " + rata2lulus);
        System.out.println("Rata2 mahasiswa yang tidak lulus: " + rata2tidakLulus);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
    
}
