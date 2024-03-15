/**
 * Switch statement: "if"
 syntax : 
    switch(value){
        case 1:
            statement
        case 2:
            statement
        case 3:
            statement
        .....
        default:
            statement
    }
WAP to print word wrt number from 1 to 9
 */

public class java0908JavaConditionalStatementsExampleSwitchChar{
    public static void main(String[] args) {
        char option = 'D';
        switch(option){
            case 'A':
                System.out.println("A for apple");
                break;
            case 'B':
                System.out.println("B for Ball");
                break;
            case 'c':
                System.out.println("C for Cat");
                break;
            case 'D':
                System.out.println("D for Dog");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
