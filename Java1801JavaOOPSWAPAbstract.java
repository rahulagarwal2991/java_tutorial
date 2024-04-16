abstract class claculator{

    abstract int sum(int a , int b);

    int sub(int a , int b){
        return a-b;
    }
}


class B extends claculator{
    int sum(int a , int b){
        return a+b;
    }
}


class Java1801JavaOOPSWAPAbstract{

    public static void main(String[] args) {
        B b = new B();
        int sum = b.sum(6, 3);
        System.out.println(sum);

        int sub = b.sub(6, 3);
        System.out.println(sub);

    }
   
}



