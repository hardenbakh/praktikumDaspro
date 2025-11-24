public class testArray {

    public static void main(String[] args) {
        
        int[] arrayA ={10,20,30,40,50};
        int[] arrayB = {0,0,0,0,0};

        System.out.println("arrayB");
        
        for(int i=0; i < arrayA.length;i++){
            arrayB[i] = arrayA[i];
            System.out.print(arrayB[i] + " ");        
        }
}
}