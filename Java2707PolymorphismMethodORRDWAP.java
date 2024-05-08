// Java2707PolymorphismMethodORRDWAP.java

class P{
    void display(){
        System.out.println("This message is from parent class");
    }
}

class C extends P{
    void display(){
        System.out.println("This message is from child class");
    }
}

class Java2707PolymorphismMethodORRDWAP {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
    
}
