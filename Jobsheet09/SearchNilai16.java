package Jobsheet09;

public class SearchNilai16 {

    public static void main(String[] args) {
     int [] nilai = {80, 85, 78, 96, 90, 82, 86};
     int key = 90;   
     int hasil=0;

     for (int i = 0; i < nilai.length; i++) {
        if (nilai[i] == key) {
            hasil = i;
            break;
        }
     }
     System.out.println();
     System.out.println("Nilai " + key + " ditemukan pada index ke-" + hasil);
     System.out.println();
    }
    
}
