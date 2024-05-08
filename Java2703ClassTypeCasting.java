/**
 * Java2703ClassTypeCasting.java
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

class Java2703ClassTypeCasting{
    public static void main(String[] args) {
        B b = new B();
        b.A1();
        b.A2();
        A a = b;
        a.A1();
        // a.A2();// a.A2(); // Java2703ClassTypeCasting.java:25: error: cannot find symbol a.A2();
    }
}

