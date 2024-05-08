class A{
    int a = 10;
    int b = 100;
    int c = 1000;
}

class B extends A{
    int a = 11;
    int b = 101;

    B(int a , int b){

       System.out.println(a + " - "+ b); // 20, 200
       System.out.println(this.a + " - "+ this.b); // 11 101
       System.out.println(super.a + " - "+ super.b); // 10 100
       System.out.println(super.c); // 1000
       System.out.println(this.c); // 1000
       System.out.println(c);// 1000

    }
}



class Java2603SuperVariableExample{
    public static void main(String[] args) {
        B b = new B(20, 200);
    }
}