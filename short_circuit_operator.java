/**
 * The main intention of short circuit operator is to improve java performance
 * && -> logical and -> all values should be true , then it will true else false  
 * || -> logical or  -> any value should be true so that i can give true else false
 * 
 * a    b    a && b     a || b
 * T    T      T          T
 * T    F      F          T
 * F    T      F          T
 * F    F      F          F
 * logical and and or operator works with comparision operators  ==, != , < , <= , > , >=
 */

public class short_circuit_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 11;

        System.out.println( ( a == b ) && ( b == c ) ); // True && False -> false
        System.out.println( ( a == b ) || ( b == c ) ); // True || False -> true

        System.out.println( ( a >= b ) && ( b <= c ) ); // true && true -> true

        System.out.println( ( a >= b ) && ( b <= c ) && ( a < c ) ); // true && true && true -> true

        System.out.println( ( a >= b ) && ( b <= c ) || ( a < c ) ); // true && true || true -> true

        System.out.println( ( a >= b ) && ( b <= c ) || ( a > c ) ); // true && true || false -> true

        System.out.println( ( a >= b ) || ( b <= c ) && ( a > c ) ); // true || true && false -> true

        System.out.println( ( a >= b ) && ( a > c ) || ( b <= c ) ); // true && false || true -> true

        System.out.println( ( a > c ) && ( a >= b ) || ( b <= c ) ); // false && true || true -> true
    }
}
