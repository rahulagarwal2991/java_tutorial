/**
 *  (true)?(value1):(value2) // value 1
    (false)?(value1):(value2) // value 2

    WAP to find max value of 2 using ternary operator
 */

public class ternary_operator {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c;
        c = (a>b)?a:b; // exp ? value 1: value 2
        System.out.println(c);
    }
}
