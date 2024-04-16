class A {

    final int method1(){
        System.out.println("Hello A ");
        return 0;
    }
}


class B extends A{
    int method1(){ // error: method1() in B cannot override method1() in A
        System.out.println("Hello B");
        return 0;
    }
}


 class Java2106FinalMethod{

    public static void main(String[] args) {
        A a = new B();
        a.method1();
    }

 }
