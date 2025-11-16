package Jobsheet09;
import java.util.Scanner;
public class SearchNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Masukkan jumlah mahasiswa: ");
        int JumlahMhs = sc.nextInt();

        int [] nilaiMhs = new int[JumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int cariNilai = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] == cariNilai) {
                System.out.println("Nilai " + cariNilai + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
            } 

    }
    if (!ditemukan) {
        System.out.println();
        System.out.println("nilai yang dicari tidak ditemukan");
    }
}
}
