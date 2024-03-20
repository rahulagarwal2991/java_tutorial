/**
 * Transfer Statements:
 * 1. break
 * 2. continue
 * 3. return
 * 
 */
public class Java1105TransferStatementContinue{
    
    public static void main(String[] args) {

        System.out.println("before loop starts");
        
        for(int i = 1; i <= 10; i++){

            if(i == 5){
                 continue;
                
            }
            System.out.println(i);

        }
        
        System.out.println("Outside of loop");

    }
}