/**
 * For loop
 * 
 * syntax : 
 * for(exp1;exp2;exp3){
 *  //statement
 * }
 * exp1 : initialization , this happens only once 
 * exp2 : validation , this happens every time in the loop
 * exp3 : modification, this also happens everytime in iteration
 */

public class java0911JavaInterativeStatementForLoop{
    public static void main(String[] args) {       
        // form 1 
        // for(int i= 1; i <=10; ++i){
        //     System.out.println(i);
        // }

        // form 2
        // int i= 1;
        // for(; i <=10; i++){
        //     System.out.println(i);
        // }

        // form 3
        int i= 1;
        for(; i <=10; ){
            i++;
            System.out.println(i);
            
        }
    }
}