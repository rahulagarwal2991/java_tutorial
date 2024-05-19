/**
 * throw
 */

 class Java3402ThrowKeyword{
    public static void main(String[] args) {
        checkAge(15);
    }

    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied you should be min 18 years of age");
        }else{
            System.out.println("Access granted");
        }
    }
 }
//  Exception in thread "main" java.lang.ArithmeticException: Access denied you should be min 18 years of age
//  at Java3402ThrowKeyword.checkAge(Java3402ThrowKeyword.java:12)
//  at Java3402ThrowKeyword.main(Java3402ThrowKeyword.java:7)

