class AClass{
    
    static int b = 100;
    int a = 100;
    static void method1(){
        b = b+1;
        System.out.println(b);
    }

}

class Java2003JavaStaticMethod{

    public static void main(String[] args) {
        AClass.method1();

        AClass.method1();

        AClass.method1();

        AClass ac = new AClass();
        ac.method1();
        
        AClass ac1 = new AClass();
        ac1.method1();
        
        AClass ac2 = new AClass();
        ac2.method1();

    }
}
/**
 * 101
102
103
104
105
106
 */