package Pertemuan14;
// // import java.util.Scanner;
  public class HitungBalok16 {

// //     static int hitungLuas (int pjg, int lb){
// //         int Luas = pjg * lb;

// //         return Luas;
// //     }
// //     static int hitungVolume  (int tinggi, int a, int b){
// //         int volume = a * b* tinggi;

// //         return volume;
// //     }
    
// //     public static void main(String[] args) {
// //         Scanner input = new Scanner(System.in);

// //         int p, l, t, L, vol;

// //         System.out.println("masukkan panjang :");
// //         p = input.nextInt();
// //         System.out.println("masukkan lebar :");
// //         l = input.nextInt();
// //         System.out.println("masukkan tinggi :");
// //         t = input.nextInt();

// //         L = p*l;
// //         System.out.println("luas persegi panjang adalah " + L);
// //         vol = p*l*t;
// //         System.out.println("Volume balok adalah " + vol);

// //         input.close();
// //     }
// // }

    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }

    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    // public static void main (String[] args) {
    //     int temp = Jumlah(1, 1);
    //     TampilJumlah(temp, 5);
    // }
}