import java.util.Scanner;
public class testArray3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] Bulan = {"januari", "februari", "maret","april", "mei", "juni","juli","agustus","september", "oktober", "november", "desember"};

        System.out.println("masukkan angka antara (1 sampai 12) :");
        int angka = sc.nextInt();

        if (angka >= 1 && angka <= 12) {
            System.out.println("Bulan ke-" + angka + " adalah " + Bulan[angka -1]);
        }
    }
}