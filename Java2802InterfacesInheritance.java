/**
 * Interfaces
 * variables 
 * public static final
 * no constructor in interfaces
 * 
 */

 interface inter1{
     public static final int a = 10;
     
     abstract void m1();
 }

 interface inter2{
    public static final int a = 10;
    
    abstract void m1();

    abstract void m2();
}

 class Java2802InterfacesInheritance implements inter1, inter2{

    public void m1(){
        System.out.println("hello from m1");
    }

    public void m2(){
        System.out.println("hello from m2");
    }

    public static void main(String[] args) {
        Java2802InterfacesInheritance jc = new Java2802InterfacesInheritance();
        System.out.println("hello");
        jc.m1();
    }

 }