package Jobsheet10;
import java.util.Scanner;
public class testArray2pt3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahRespon = 10;
        int[][] hasilSurvey = new int[6][jumlahRespon];
        

        for(int i = 0; i < 6 ; i++){
            double total=0;
            System.out.println("pertanyaan " +  (i + 1));

            for(int j = 0 ; j < jumlahRespon; j++){
                

                System.out.printf("Masukkan nilai Pilihan (1-5) untuk responden ke-%d : ", (j + 1));
                hasilSurvey[i][j] = sc.nextInt();

                total += hasilSurvey[i][j];
                } 
                double rata2 = total / jumlahRespon;
                System.out.println(rata2);
                
            
            }
 }
}