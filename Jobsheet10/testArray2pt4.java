package Jobsheet10;
import java.util.Scanner;
public class testArray2pt4{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] hasilSurvey = new int[6][10];

         int totalData = 6 * 10;
         int totalSurvey=0;
        int rata2;
        for (int i = 0; i < 6; i++) {
            System.out.println("pertanyaan ke :" + (i+1));
            for (int j = 0; j < 10; j++) {
                System.out.println(" jawaban Responden ke :" + (j+1));
                hasilSurvey[i][j] = sc.nextInt();
            
                totalSurvey += hasilSurvey[i][j];
            }
        }
        rata2 = totalSurvey / totalData;
    System.out.println("rata rata nilai dari semua pertanyaan adalah :" + rata2);
       
    }
}
  