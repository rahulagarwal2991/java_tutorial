class Outerclass{
    int a = 10;

    protected class InnerClass{
        int b = 5;
    }
    class main extends InnerClass{
        int returnB(){
            return b;
        }
    }
}

public class Java2903PrivateInnerClassWAP{
    public static void main(String[] args) {
        Outerclass oc = new Outerclass();
        System.out.println(oc.a);

        Outerclass.main myInnerClass = oc.new main();
        System.out.println(myInnerClass.b);
    }
}