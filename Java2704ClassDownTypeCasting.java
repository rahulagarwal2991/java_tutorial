/**
 * Java2704ClassDownTypeCasting.java
 */


class A{
    void A1(){
        System.out.println("Hello from super class");
    }
}

class B extends A{
    void A2(){
        System.out.println("Hello from child class");
    }
}

class Java2704ClassDownTypeCasting{
    public static void main(String[] args) {
        A a = new A();
        B b = a; // Java2704ClassDownTypeCasting.java:21: error: incompatible types: A cannot be converted to B B b = a;
        
    }
}

