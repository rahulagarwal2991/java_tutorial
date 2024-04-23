/**
 * Inheritance:The process of 
 * getting variables and methods from another class is called as inheritance
 
 * 1. Single Inheritance:
 * 
 * class A{
 *  int returnValue(){
 *      return 1;
 *  }
 * }
 * 
 * class B extends A{
 *  int returnValue(){
 *      return 5;
 *  }
 * }
 * 
 
 *      a. Multilevel Inheritance
 *          class A{}
 *          
 *          class B extends A{}
 * 
 *          class C extends B{}    
 *          
 *      b. Hierchical Inheritance
 *          class A{}

            class B extends A{}

            class C extends A{}

            class D extends B{}

            class E extends B{}

            class F extends C{}

            class G extends C{}


 *      c. Hybrid Inheritance
 *          
 * 

 * 
 * 2. Multiple Inheritance:
 * class A{
 *  int returnValue(){
 *      return 1;
 *  }
 * }
 * 
 * class B{
 *  int returnValue(){
 *      return 2;
 *  }
 * }
 * 
 * class C extends A, B{
 *  int returnValue(){
 *      return 3;
 *  }
 * }
 * 
 * what is multiple inheritance and why its not in java?
 * 
 */