import java.util.ArrayList;
import java.util.Scanner;
public class testPerulangan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> LakiLaki = new ArrayList<>();
        ArrayList<String> Perempuan = new ArrayList<>();

    for (int n=0 ; n<30;n++){
        System.out.println("Masukkan nama anda :");
        String Nama = sc.nextLine();
        System.out.println("masukkan jenis kelamin anda (LakiLaki/Perempuan :");
        String jenisKelamin = sc.nextLine();

        if (jenisKelamin.equalsIgnoreCase("LakiLaki")) {
            LakiLaki.add(Nama);
        } else{
            Perempuan.add(Nama);
        }
    }

    System.out.println("list (lakiLaki/Perempuan) : ");
    String pilihan = sc.nextLine();

    if (pilihan.equalsIgnoreCase("LakiLaki")) {
        System.out.println( " list LakiLaki" );

        for(String Nama : LakiLaki)
        System.out.println("- " + Nama);
        
    } else if (pilihan.equalsIgnoreCase("Perempuan")) {
        System.out.println(" list Perempuan");
        for (String Nama : Perempuan)
        System.out.println("- "+Nama);
    }
    


    }
} 