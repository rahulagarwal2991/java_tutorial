class Outerclass{
    int a = 10;

    class InnerClass{
        int b = 5;
    }
}

public class Java2902InnerClassWAP{
    public static void main(String[] args) {
        Outerclass oc = new Outerclass();
        System.out.println(oc.a);

        Outerclass.InnerClass myInnerClass = oc.new InnerClass();
        System.out.println(myInnerClass.b);
    }
}