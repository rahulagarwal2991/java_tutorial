/**
 * Interfaces
 * variables 
 * public static final
 * no constructor in interfaces
 * 
 */

 interface inter1{
     int a = 10;
     
     void m1();
 }

 class Java2801Interfaces implements inter1{

    public void m1(){
        System.out.println("hello from m1");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }

 }