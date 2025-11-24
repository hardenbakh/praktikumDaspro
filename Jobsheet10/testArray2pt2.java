package Jobsheet10;
import java.util.Scanner;
public class testArray2pt2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pertanyaan= 6;
        int[][] hasilSurvey = new int[pertanyaan][10];
        

        for(int j = 0; j < 10 ; j++){
            double total=0;
            System.out.println("responden " +  (j + 1));

            for(int i = 0 ; i < pertanyaan; i++){
                

                System.out.printf("Masukkan nilai Pilihan (1-5) untuk Pertanyaan ke-%d : ", (i + 1));
                hasilSurvey[i][j] = sc.nextInt();

                total += hasilSurvey[i][j];
                } 
                double rata2 = total / pertanyaan;
                System.out.println(rata2);
                
            
            }
 }
}