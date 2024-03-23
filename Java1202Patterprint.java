/**
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9 
 0 1 2 3 4 5 6 7 8 9
 0 1 2 3 4 5 6 7 8 9
  
 */
public class Java1202Patterprint{
    
    public static void main(String[] args) {
        
        for(int i = 0; i<=9;i++){ // 0
            for(int j = 0; j<=9 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/**
 * steps of for loop
 * 1. initialzation
 * 2. comparision
 * 3. body code execution until step 2 returns true
 * 4. modification
 * 
 * repeat step 2,3 and 4
 */

// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9