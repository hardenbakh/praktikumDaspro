import java.util.Scanner;
public class PemilihanHariDenganIf17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka hari (1-7): ");
        int angka = sc.nextInt();

        if (angka >= 1 && angka <= 5){
            System.out.println( "weekday");
        } else if (angka > 5 && angka <7){
            System.out.println("weekend");
        }else {
            System.out.println("invalid number ");
        }
    }
}
