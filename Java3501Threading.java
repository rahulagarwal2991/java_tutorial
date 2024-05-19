/**
 * Java3501Threading.java
 * 1->
 * 1-> 
 * 1->
 * 1
 * 1
 * 
 
 */

 class Java3501Threading{
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

