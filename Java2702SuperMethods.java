/**
 * Java2702SuperMethods.java
 * syntax: 
 * super.method_name([list])
 */

class A{
    void A1(){
        System.out.println("This is from parent paramterized constructor");
    }
}

class B extends A{

    B(){
        A1();
        super.A1();
        System.out.println("This is from child constructor");
    }
}

class Java2702SuperMethods {
    public static void main(String[] args) {
        new B();
    }
}