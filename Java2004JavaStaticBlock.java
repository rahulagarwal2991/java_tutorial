class AClass{
    
    static int b = 100;
    int a = 100;

    static{
        b = b+1;
        System.out.println(b);
        AClass ac = new AClass();
        System.out.println(ac.a);
        // System.out.println(a);// error: non-static variable a cannot be referenced from a static context
    }

}

class Java2004JavaStaticBlock{

    public static void main(String[] args) {
        AClass ac = new AClass();

        
    }
}
