class Outerclass{
    int a = 10;

    static class InnerClass{
        int b = 5;
    }
}

class Java2904staticInnerClassWAP{
    public static void main(String[] args) {
        
        Outerclass.InnerClass myInnerClass = new Outerclass.InnerClass();
        System.out.println(myInnerClass.b);
    }
}