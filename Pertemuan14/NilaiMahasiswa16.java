package Pertemuan14;
import java.util.Scanner;

public class NilaiMahasiswa16 {

    // a. Fungsi isianArray 
    static void isianArray(int[] nilai) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    // b. Fungsi tampilArray
    static void tampilArray(int[] nilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    // c. Fungsi hitTot
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Masukkan jumlah mahasiswa : ");
        int N = input.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}