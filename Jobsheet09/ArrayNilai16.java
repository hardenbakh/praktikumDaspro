package Jobsheet09;
import java.util.Scanner;
public class ArrayNilai16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai akhir mahasiswa ke-" + i + " adalah: " + nilaiAkhir[i]);
        }
    }
}
