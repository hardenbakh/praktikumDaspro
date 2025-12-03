package Pertemuan14;
import java.util.Scanner;

public class RekapPenjualanCafe16 {

    static int[][] dataPenjualan = new int[5][7];
    static String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static Scanner sc = new Scanner(System.in);
    
   
    static void inputDataPenjualan() {
        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMenu: " + namaMenu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j+1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nData berhasil diinputkan!");
    }
    
    static void tampilkanSemuaDataPenjualan() {
        System.out.println("\n=== DATA PENJUALAN SELURUH MENU ===");
        System.out.printf("%-18s", "Menu");
        
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Hari %d  ", i);
        }
        System.out.println("\n" + "-".repeat(70));
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-18s", namaMenu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-8d", dataPenjualan[i][j]);
            }
            System.out.println();
        }
    }
    
    static void tampilkanMenuTertinggi() {
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        
        for (int hari = 0; hari < 7; hari++) {
            int maksimal = dataPenjualan[0][hari];
            int indexMenuMaks = 0;
            
            // Mencari penjualan tertinggi untuk hari tertentu
            for (int i = 1; i < 5; i++) {
                if (dataPenjualan[i][hari] > maksimal) {
                    maksimal = dataPenjualan[i][hari];
                    indexMenuMaks = i;
                }
            }
            
            System.out.println("Hari ke-" + (hari+1) + ": " + namaMenu[indexMenuMaks] + 
                             " (" + maksimal + " porsi)");
        }
    }
    
    // Fungsi untuk menghitung total penjualan per menu
    // Fungsi dengan return value (int) dan parameter (indexMenu)
    static int hitungTotalPenjualan(int indexMenu) {
        int total = 0;
        for (int j = 0; j < 7; j++) {
            total += dataPenjualan[indexMenu][j];
        }
        return total;
    }
    
    // Fungsi untuk menghitung rata-rata penjualan
    // Fungsi dengan return value (double) dan parameter (total)
    static double hitungRataRata(int total) {
        return (double) total / 7;
    }
    
    // Fungsi untuk menampilkan rata-rata penjualan setiap menu
    // Fungsi tanpa return value (void) dan tanpa parameter
    static void tampilkanRataRataPenjualan() {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        
        for (int i = 0; i < 5; i++) {
            // Memanggil fungsi hitungTotalPenjualan
            int total = hitungTotalPenjualan(i);
            
            // Memanggil fungsi hitungRataRata
            double rataRata = hitungRataRata(total);
            
            System.out.printf("%-18s: %.2f porsi/hari (Total: %d porsi)\n", 
                            namaMenu[i], rataRata, total);
        }
    }
    
    // Fungsi tanpa return value (void) dan tanpa parameter
    static void tampilkanMenu() {
        System.out.println("\n" + "=".repeat(55));
        System.out.println("   SISTEM REKAP PENJUALAN KAFE BU MARIANA");
        System.out.println("=".repeat(55));
        System.out.println("1. Input Data Penjualan");
        System.out.println("2. Tampilkan Seluruh Data Penjualan");
        System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
        System.out.println("4. Tampilkan Rata-rata Penjualan per Menu");
        System.out.println("5. Keluar");
        System.out.println("=".repeat(55));
        System.out.print("Pilih menu (1-5): ");
    }
    
    // Fungsi main (program utama)
    public static void main(String[] args) {
        int pilihan;
        
        do {
            // Memanggil fungsi tampilkanMenu
            tampilkanMenu();
            pilihan = sc.nextInt();
            
            // Pemilihan fungsi berdasarkan input user
            switch (pilihan) {
                case 1:
                    inputDataPenjualan();
                    break;
                case 2:
                    tampilkanSemuaDataPenjualan();
                    break;
                case 3:
                    tampilkanMenuTertinggi();
                    break;
                case 4:
                    tampilkanRataRataPenjualan();
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih 1-5.");
            }
        } while (pilihan != 5);
        
         
    }
}