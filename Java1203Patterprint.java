/**
0000000000
1111111111
2222222222
3333333333
4444444444
5555555555
6666666666
7777777777
8888888888
9999999999
  
 */
public class Java1203Patterprint{
    
    public static void main(String[] args) {
        
        for(int i = 0; i<=9;i++){ // 0
            for(int j = 0; j<=9 ; j++){
                System.out.print(i);
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