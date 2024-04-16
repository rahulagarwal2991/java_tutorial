/**
Java2102factoryMethod.java
 */

 class A {// singleton class
   
    static A objOfA = null;

    static A getReference(){
        if(objOfA == null){
            objOfA = new A();
            return objOfA;
        }else {
            return objOfA;
        }
    }
 }


 class Java2104SingletonClass{
     public static void main(String[] args) {
         System.out.println(A.getReference());
         System.out.println(A.getReference());
         System.out.println(A.getReference());
         System.out.println(A.getReference());
         System.out.println(A.getReference());
// A@251a69d7
// A@251a69d7
// A@251a69d7
// A@251a69d7
// A@251a69d7

     }
 }