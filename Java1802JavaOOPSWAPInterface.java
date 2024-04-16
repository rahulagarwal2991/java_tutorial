interface calculator{
    
    int sum(int a , int b);

}


class B implements calculator{
    public int sum(int a , int b){
        return a+b;
    }
}


class Java1802JavaOOPSWAPInterface{

    public static void main(String[] args) {
        B b = new B();
        int sum = b.sum(6, 3);
        System.out.println(sum);

    }
   
}



