package Jobsheet10;
import java.util.Scanner;
public class testArray2pt1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] hasilSurvey = new int[6][10];

        for (int i = 0; i < hasilSurvey.length; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.println("masukkan nilai 10 peserta "+ "pertanyaan " + (i+1)+ " :");
                hasilSurvey[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("hasil survey");
        for (int i = 0; i < hasilSurvey.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(hasilSurvey[i][j] + "\t");
            }
            System.out.println();
        }

     
    }
}
