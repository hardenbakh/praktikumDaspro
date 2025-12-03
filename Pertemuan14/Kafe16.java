package Pertemuan14;
import java.util.Scanner;
public class Kafe16 {

    public static void main(String[] args) {
        Menu("Bambang", true, "DISKON50,DISKON30");

        Scanner sc = new Scanner(System.in);

        int maxMenu = 10;
        int[] daftarMenu = new int[maxMenu];
        int[] jumlahItem = new int[maxMenu];
        int totalMenu = 0;

        String tambah;
        do {
            if (totalMenu >= maxMenu) {
                System.out.println("jumlah maksimal sudah tercapai");
                break;
            }

        System.out.println("masukkan nomor menu : ");
        int pilihanMenu = sc.nextInt();

        System.out.println("masukkan banyak item :");
        int banyakItem = sc.nextInt();

        daftarMenu[totalMenu] = pilihanMenu;
        jumlahItem[totalMenu] = banyakItem;
        totalMenu++;

        sc.nextLine();
        System.out.println("Apakah ingin menambah menu lainnya?");
        tambah = sc.nextLine();

        }while (tambah.equalsIgnoreCase("ya"));

        System.out.println("Masukkan kode promo : ");
        String kodePromo = sc.nextLine();


        int totalBayar = hitungTotalHarga16(daftarMenu, jumlahItem, totalMenu, kodePromo);

        System.out.println("total yang harus dibayarkan  Rp." + totalBayar);

    }

    // perhitungan harga
    public static int hitungTotalHarga16(int[] daftarMenu, int[] jumlahItem,int totalMenu, String kodePromo){
        int[] hargaItems ={15000,20000,22000,12000,10000,18000};

        int hargaTotal = 0;
        for (int i =0; i < totalMenu; i++){
            int j = daftarMenu[i] -1;
            hargaTotal += hargaItems[j] * jumlahItem[i];
        }

        int diskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 50/100;
            System.out.println("Selamat anda mendapat pengurangan harga sebesar 50%");

        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 30/100;
            System.out.println("Selamat anda mendapat pengurangan harga sebesar 30%");

        } else  {
            System.out.println(" karena kode invalid maka tidak ada pengurangan total harga!");
        }

        hargaTotal -= diskon;

        return hargaTotal;
    }

    
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        Scanner sc = new Scanner(System.in);
        // menampilkan nama pelanggan
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        // menampilkan member jika nilainya true
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        // memasukkan kode promo
        // System.out.println("Masukkan kode promo anda : ");
        // kodePromo = sc.nextLine();
        //// menampilkan kode promo yang didapat
        // if (kodePromo.equalsIgnoreCase("DISKON50")) {
        //     System.out.println("Selamat anda mendapatkan diskon sebesar 50%");

        // } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        //     System.out.println("Selamat anda mendapatkan diskon sebesar 30%");
        // }else   {
        //     System.out.println("kode promo tidak valid!!");
        // }
        // daftar menu
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    
}
