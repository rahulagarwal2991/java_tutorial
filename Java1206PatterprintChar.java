/**
A A A A A 
B B B B B
C C C C C 
D D D D D
E E E E E
*/
public class Java1206PatterprintChar{
    
    public static void main(String[] args) {
        
        for(int i = 0; i<5;i++){ 
            for(int j = 0 ; j < 5 ; j++){
                System.out.print( (char)(65+i)+"  " );
            }
            System.out.println();
        }
    }
}

/**
A  A  A  A  A  
B  B  B  B  B  
C  C  C  C  C  
D  D  D  D  D  
E  E  E  E  E
 */