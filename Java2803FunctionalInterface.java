/**
 * 
 */

 @FunctionalInterface
 interface I{
     void m1();

    //  void m2();// if we uncommment this we will get error
 }

 class Java2803FunctionalInterface implements I {

     public void m1(){
        System.out.println("Hello from m1");
    }

    void m2(){
        System.out.println("Hello from m2");
    }
     public static void main(String[] args) {
        Java2803FunctionalInterface jo = new Java2803FunctionalInterface();
        jo.m1();
        jo.m2();
     }
 }