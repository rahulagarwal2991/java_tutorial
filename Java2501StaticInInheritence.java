/*
// Static Context in inheritance
*/


class A{// super class
    static {
        System.out.println("Static Block of A");
    }
}

class B extends A{ // sub class
    static {
        System.out.println("Static Block of B");
    }
}

class Java2501Inheritance {
    public static void main(String[] args) {
        B b = new B();
    }
}