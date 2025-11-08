package Jobsheet08;
import java.util.Scanner;
public class NilaiKelompok16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai,rataNilai=0;
        int i= 1;
        int kelompokTertinggi=0;
        int kelompokTerendah=0;

        double tertinggi, terendah;
        tertinggi = 0;
        terendah = 100;
        

        while (i<=6) {
            System.out.println("Kelompok " + i);
            totalNilai=0;

            for(int j = 1;j <=5; j++){
                System.out.print("Masukkan nilai ke " + j + "; ");
                nilai= sc.nextDouble();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("rata-rata: " +rataNilai);

            
         if (rataNilai>tertinggi) {
            tertinggi= rataNilai  ;
            kelompokTertinggi =i;

         } else if (rataNilai<terendah) {
            terendah = rataNilai;
            kelompokTerendah=i;
         }
            i++;
        }
        

         System.out.println("kelompok dengan rata-rata nilai tertinggi : " + kelompokTertinggi);
         System.out.println("dengan nilai : " + tertinggi);
         System.out.println("kelompok dengan rata-rata nilai terendah :" + kelompokTerendah);
         System.out.println("dengan nilai : "+ terendah );

        
    }
    
}
