import java.util.Scanner ;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bilangan3 = sc.nextInt();
        
        int maksimum = bilangan1;
        int minimum = bilangan1;

        if (bilangan2 > maksimum) {
            maksimum = bilangan2;
        }
        if (bilangan2 < minimum) {
            minimum = bilangan2;
        }

        if (bilangan3 > maksimum) {
            maksimum = bilangan3;
        }
        if (bilangan3 < minimum) {
            minimum = bilangan3;
        }

        System.out.println("Bilangan maksimum adalah: " + maksimum);
        System.out.println("Bilangan minimum adalah: " + minimum);
    }
}