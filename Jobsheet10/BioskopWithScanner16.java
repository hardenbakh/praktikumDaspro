package Jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];
        
        while (true) {
            
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine(); 
            
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                
                 boolean kursiTersedia = false;

                 while (!kursiTersedia) {
                    
                 
                while (true) {
                    System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                    baris = sc.nextInt();
                    
                    if (baris >= 1 && baris <= penonton.length) {
                        break;
                    } else {
                        System.out.println("Baris tidak tersedia! Silakan input ulang.");
                    }
                }
                
                while (true) {
                    System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                    kolom = sc.nextInt();
                    
                    if (kolom >= 1 && kolom <= penonton[0].length) {
                        break;
                    } else {
                        System.out.println("Kolom tidak tersedia! Silakan input ulang.");
                    }
                }
                sc.nextLine(); 
                
                 if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("WARNING: Kursi sudah terisi oleh " + penonton[baris-1][kolom-1]);
                        System.out.println("Silakan pilih kursi lain!\n");
                      
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                        kursiTersedia = true;
                    }
                }
                
            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        if (namaPenonton == "***") {
                            namaPenonton = "***";
                        }
                        System.out.print("Baris " + (i+1) + " Kolom " + (j+1) + ": " + namaPenonton);
                        System.out.println();
                    }
                }
                
            } else if (menu == 3) {
        
                System.out.println("Terima kasih! Program selesai.");
                sc.close();
                return;
                
            } else {
                System.out.println("Menu tidak valid! Silakan pilih 1-3.");
            }
        }
    }
}