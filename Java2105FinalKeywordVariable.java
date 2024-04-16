/**
 * final keyword:
 * 
 * 1. final variable
 * 2. final method
 * 3. final class
 * 
 */


 class Java2105FinalKeywordVariable{

    public static void main(String[] args) {
        int a = 10;
        a = a +  5;
        System.out.println(a);

        final int b = 20;
        b = b + 5;// Error : cannot assign a value to final variable b

        System.out.println(b);
    }

 }
