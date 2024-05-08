class Outerclass{
    int a = 10;

    public class InnerClass{
        public int myInnerMethod(){
            return a;
        }
        
    }
}

class Java2905UseOuterClassInInnerClass{
    public static void main(String[] args) {
        Outerclass o = new Outerclass();

        Outerclass.InnerClass myInnerClass = o.new InnerClass();
        System.out.println(myInnerClass.myInnerMethod());
    }
}