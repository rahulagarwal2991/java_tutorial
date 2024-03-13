/**
 * ==, != , < , <= , > , >=
 * 
 * Boolean value ->  True or False
 */

public class comparision_operator {
    public static void main(String[] args) {
        int a = 100;
        int b = 90;
        int c = 100;
        int d = 100;
        // == equality operator
        //check if both values are equal or not
        System.out.println( a == b);// 100 == 90 : output  False
        System.out.println( a == c);// 100 == 100 , output : true

        // != not equal operator
        System.out.println( a != b);// 100 != 90 : output  True
        System.out.println( a != c);// 100 != 100 , output : false

        // < less than operator 
        // comapre left hand side should be smaller than right hand side value
        System.out.println( a < b);// 100 < 90 : output  False
        System.out.println( b < a);// 90 < 100 : output  true
        System.out.println( a < c);// 100 < 100 , output : false

        // <= less than equal to operator
        // compare LHS with RHS where LHS should be smaller or equal
        System.out.println( a <= b);// 100 <= 90 : output  False
        System.out.println( b <= a);// 90 <= 100 : output  true
        System.out.println( a <= c);// 100 <= 100 , output : true

        //>  greater than operator 100 > 99
        // compare LHS with RHS where LHS should be greater than RHS
        System.out.println( a > b);// 100 > 90 : output  true
        System.out.println( b > a);// 90 > 100 : output  false
        System.out.println( a > c);// 100 > 100 , output : false

        //>=  greater than or equal operator 100 >= 100
        // compare LHS with RHS where LHS should be greater than RHS or LHS is equal to RHS
        System.out.println( a >= b);// 100 >= 90 : output  true
        System.out.println( b >= a);// 90 >= 100 : output  false
        System.out.println( a >= c);// 100 >= 100 , output : true
    }

}
