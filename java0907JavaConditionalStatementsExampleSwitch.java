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

public class java0907JavaConditionalStatementsExampleSwitch{
    public static void main(String[] args) {
        int option = 7;
        switch(option){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
