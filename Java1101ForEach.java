/**
 * WAP to print value from 1 to 5
 */
public class Java1101ForEach {
    public static void main(String[] args) {       
        
        
        // for(int i= 1; i <=5; i++){
        //     System.out.println(i);
        // }
        // 1
        // 2
        // 3
        // 4
        // 5

        // int[] array ={1,2,3,4,5};
        // for(int i= 0; i <5; i++){
        //     System.out.println(array[i]);
        // }
        // 1
        // 2
        // 3
        // 4
        // 5
        int[] array ={1,2,3,4,5};
        for(int key:array){
            System.out.println(key);
        }
        // 1
        // 2
        // 3
        // 4
        // 5
        /**
         * Syntax :
         * for(array_value:array){
         *  statement
         * }
         * 
         */
    }
}