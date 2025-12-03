package Pertemuan14;
import java.util.Scanner;

public class Kubus16 {

    public static void main(String[] args) {
        int sisi = inputSisi(); 
        int hasilVolume = volume(sisi);
        System.out.println("Volume kubus adalah " + hasilVolume);

        int hasilLuas = luas(sisi);
        System.out.println("Luas kubus adalah " + hasilLuas);
    }

    static int inputSisi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi:");
        return sc.nextInt();
    }

    static int volume(int sisi){
        return sisi * sisi * sisi;
    }

    static int luas(int sisi){
        return 6 * (sisi * sisi);
    }
}
