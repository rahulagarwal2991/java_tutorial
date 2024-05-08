// Java2502InstanceInInheritence.java

/**
 * 
 * 
 * Instance and static Context in Inheritance
 */

class A{// super class
    static {
        System.out.println("Static Block of A");
    }

    A() {
        System.out.println("Instance context of A");
    }
}

class B extends A{ // sub class
    static {
        System.out.println("Static Block of B");
    }
    B() {
        System.out.println("Instance context of B");
    }
}

class Java2503InstanceStaticInheritence {
    public static void main(String[] args) {
        B b = new B();
    }
}
// Output
// Static Block of A
// Static Block of B
// Instance context of A
// Instance context of B