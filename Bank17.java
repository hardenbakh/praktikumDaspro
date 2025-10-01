import java.util.Scanner;
    public class Bank17 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double tabunganAwal, TabunganAkhir, bunga, PersentaseBunga;
            int lamaMenabung;
            PersentaseBunga = 0.0002;

            System.out.println("Masukkan jumlah tabungan awal: ");
            tabunganAwal = sc.nextDouble();
            System.out.println("Masukkan lama menabung (bulan): ");
            lamaMenabung = sc.nextInt();

            bunga = PersentaseBunga * lamaMenabung * tabunganAwal;
            TabunganAkhir = tabunganAwal + bunga;

            System.out.println("Bunga " + bunga);
            System.out.println("Tabungan akhir: " + TabunganAkhir);
        }
    }