package Jobsheet10;
import java.util.Scanner;
public class Siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("masukkan jumlah mahasiswa : ");
       int mahasiswa= sc.nextInt();

       System.out.println("Masukan jumlah matkul : ");
       int jumlahMatkul= sc.nextInt();

       int [][]nilai = new int[mahasiswa][jumlahMatkul];

       for(int i = 0 ; i < mahasiswa; i++){
        System.out.println("input nilai mahasiswa ke " +(i+1));
        double totalPerSiswa = 0;

        for(int j = 0 ; j < jumlahMatkul; j++){
            System.out.println("nilai mata kuliah " + (j+1) +": ");
            nilai[i][j] = sc.nextInt();
            totalPerSiswa += nilai[i][j];
        }
        System.out.println("Nilai rata-rata: " +totalPerSiswa/jumlahMatkul);

    }
    System.out.println("\n==============================");
    System.out.println("Rata-rata Nilai setiap mata kuliah :");

    for (int j = 0; j < jumlahMatkul;j++){
        double totalMatkul = 0;
        for (int i = 0 ; i < mahasiswa; i++){
            totalMatkul += nilai[i][j];
        }
        System.out.println("mata kuliah " + (j+1) + ": " + totalMatkul/mahasiswa);
    }
}
}