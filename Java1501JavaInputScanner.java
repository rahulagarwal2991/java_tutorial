
import java.util.Scanner;// line 1

class Java1501JavaInputScanner{

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // line 2
        System.out.println("Enter your name");

        String name = myObj.nextLine(); // line 3  String name = "Utkarsh";
        System.out.println("your name is "+ name);
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