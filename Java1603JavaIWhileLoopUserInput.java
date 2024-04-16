/**
         * 1 => add
         * 2 = sub
         * 3 => mul
         * 4 => div
         * 
         */
// Java1503JavaIWhileLoopUserInput.java
import java.util.Scanner;

class Java1603JavaIWhileLoopUserInput{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); 
        int i =1;

        while(i != 0){
            int output =0;
            System.out.print("Enter operation");
            int operation = myObj.nextInt();
            System.out.println("");
    
            System.out.print("Enter number 1");
            int value1 = myObj.nextInt();
            System.out.println("");
    
            System.out.print("Enter number 2");
            int value2 = myObj.nextInt();
            System.out.println("");
    
            if(operation == 1){
                output = value1 + value2;
    
            }
    
            System.out.print("Your output is ");
            System.out.println(output);

            System.out.print("If you want to continue press 1 else press 0");
            i = myObj.nextInt();
            
        }
        

    }

}

/**
 * 
 * nextLine() 
 * nextByte()
 * nextBoolean()
 * nextDouble()
 * nextInt()
 * nextLong()
 * nextShort()
 */