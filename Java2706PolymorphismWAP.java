// Java2706PolymorphismWAP.java

class A {
    void add (int a, int b){// case 1
        System.out.println(a+b);
    }
    void add (int a, int b, int c ){ // case 1
        System.out.println(a+b+c);
    }
    void add (int a, int b, int c , int d){ // case1
        System.out.println(a+b+c+d);
    }

    void add (float a, float b){// case 2
        System.out.println(a+b);
    }

    void add (int a, float b){// case 3
        System.out.println(a+b);
    }
    void add (float a, int b){// case 3
        System.out.println(a+b);
    }

}

class Java2706PolymorphismWAP {
    public static void main(String[] args) {
        A a = new A();
        a.add(10,20);
        a.add(10.1f,20.1f);
        a.add(10,20, 30);
        a.add(10,20, 30 ,40);
    }
}
