// constructor : 
class A{
    void A(){// normal method
        System.out.println("Hello You are in class A");
    }

    // int A(int a , int b){
    //     System.out.println("Hello You are in class A int type");
    //     return a+b;
    // }

    A(){ // constructor
        System.out.println("Hello You are in class A - A");
    }
}

class Java1804JavaOOPSConstructor{
    public static void main(String[] args) {
        A a = new A();// it calls constructor
        a.A();// it calls normal methods
    }
}

/**
 * 
 * 
 */