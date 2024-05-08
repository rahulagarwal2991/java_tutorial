class A{
    int a = 10;
    int b = 100;
    int c = 1000;
}

class B extends A{
    int a = 11;
    int b = 101;

    B(){
       System.out.println(this.a + " - "+ this.b); // 11 101
       System.out.println(super.a + " - "+ super.b); // 10 100
       System.out.println(super.c);
       System.out.println(this.c);
       System.out.println(c);

    }
}



class Java2602SuperVariable{
    public static void main(String[] args) {
        B b = new B();
    }
}