import java.util.Scanner;

public class TestUjianFailFast {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan; 

        System.out.println("--- Pengecekan Syarat Ujian Skripsi ---");
        
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();

            System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();
            
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = ">> panjenengan di padosi kaleh dosen ingkang nami ne Nabila Azkiya Ramadhani";
            } else {
                pesan = ">> Gagal! Jumlah log bimbingan tidak mencukupi.";
            }

        } else {
            
            pesan = ">> Pendaftaran Gagal! Mahasiswa masih memiliki tanggungan kompen.";
        }
        
        System.out.println("\n" + pesan);
    }
}