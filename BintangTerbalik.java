public class BintangTerbalik {

    public static void main(String[] args) {
        
        
        for(int i = 1; i<=10; i++){

            for(int l = 10; l> i ;l--){
                System.out.print(" ");
            }
            
            for(int j = 0 ; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
