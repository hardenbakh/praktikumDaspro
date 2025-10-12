import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Output: Genap");
        } else {
            System.out.println("Output: Ganjil");
        }
    }
}