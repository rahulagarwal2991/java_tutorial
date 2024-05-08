// Refer super class constructor
// super([data])

class A{

    A(){
        System.out.println("This is from parent non paramterized constructor");
    }

    A(int i){
        System.out.println("This is from parent paramterized constructor");
    }
}

class B extends A{
    B(){
        super();
        // super(100);
        System.out.println("This is from child constructor");
    }
}


class Java2701SuperClassConstructor {
    public static void main(String[] args) {
        new B();
    }
}