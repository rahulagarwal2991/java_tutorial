/**
9999999999
8888888888  
7777777777
6666666666
5555555555
4444444444
3333333333
2222222222
1111111111
0000000000
*/
public class Java1205PatterprintReverse1203{
    
    public static void main(String[] args) {
        
        for(int i = 9; i>=0;i--){ 
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