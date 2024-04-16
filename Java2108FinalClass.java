final class A {

    int method1(){
        System.out.println("Hello A ");
        return 0;
    }
}


class B extends A{ // error: cannot inherit from final A
    final int method1(){ // it will work
        System.out.println("Hello B");
        return 0;
    }
}


 class Java2108FinalClass{

    public static void main(String[] args) {
        A a = new B();
        a.method1();
    }

 }
