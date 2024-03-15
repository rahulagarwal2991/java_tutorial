/**
 * wap to grade the students in a class
 * 
 * more than 60 or equal to -> I div
 * more than 50 or equal to -> II div
 * more than 33 or equal to -> III div
 * otherwise    -> fail
 *  */ 

public class java0905JavaConditionalStatementsExample{
    public static void main(String[] args) {
        int marks =70;
        int i = 1;
        if( (i++)>0 && marks >= 60){
            System.out.println("I division");
        }

        if( (i++)>0 && marks >= 50 && marks < 60){
            System.out.println("II division");
        }

        if((i++)>0 &&  marks >=33 && marks <50){
            System.out.println("III division");
        }

        if( (i++)>0 &&  marks <33){
            System.out.println("Fail");
        }
        System.out.println(i);
    }
}
// if block is getting checked 4 times