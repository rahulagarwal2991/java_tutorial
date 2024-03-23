/**
 *   * * * * *
 *   * * * * *
 *   * * * * *
 *   * * * * *
 *   * * * * *
 *  println -> move cursor to new line
 *  print   -> print and cursor remains at same line
 */
public class Java1201Patterprint{
    
    public static void main(String[] args) {
        
        for(int i = 1; i<=5;i++){
            for(int y =1; y<=5 ; y++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // for(int i = 1; i<=4;i++){
        //     for(int y =1; y<=4 ; y++){
        //         System.out.print(i+" "+y+"    ");
        //     }
        //     System.out.println();
        // }
    }
}

// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * *