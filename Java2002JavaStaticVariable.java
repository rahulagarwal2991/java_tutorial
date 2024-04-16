class AClass{
    
    static int b = 100;
    int a = 100;
    void method1(){
        b = b+1;
        a = a+1;
    }

}

class Java2002JavaStaticVariable{

    public static void main(String[] args) {
        AClass obj = new AClass();
        obj.method1();
        System.out.println(obj.b);// 101
        System.out.println(AClass.b);// 101
        System.out.println(obj.a);// 101

        AClass obj1 = new AClass();
        obj1.method1();
        System.out.println(obj1.b);// 102
        System.out.println(AClass.b);// 102
        System.out.println(obj1.a);// 101
    }
}
