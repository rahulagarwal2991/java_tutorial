// Java2502InstanceInInheritence.java

/**
 * 
 * 
 * Instance Context in Inheritance
 */

class A{// super class
    A() {
        System.out.println("Instance context of A");
    }
}

class B extends A{ // sub class
    B() {
        System.out.println("Instance context of B");
    }
}

class Java2502InstanceInInheritence {
    public static void main(String[] args) {
        B b = new B();
    }
}