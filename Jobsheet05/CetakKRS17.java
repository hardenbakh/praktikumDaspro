
import java.util.Scanner;
public class CetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println(" Apakah UKT sudah lunas? (true/false)");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("silahkan setak KRS dan minta tanda tangan DPA");
        }
        else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }
    }
}
