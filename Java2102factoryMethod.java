/**
Java2102factoryMethod.java
 */

 class A {
    
    A(){
        System.out.println("A constructor");
    }

    void method1(){
        System.out.println("Mthod 1 of A");
    }

    static A getReference(){ // Factory method
        A a = new A();
        return a;
    }

 }


 class Java2102factoryMethod{
     public static void main(String[] args) {
         A obj = A.getReference();
         obj.method1();
         System.out.println(A.getReference());// A@251a69d7
         System.out.println(A.getReference());// A@7344699f

     }
 }