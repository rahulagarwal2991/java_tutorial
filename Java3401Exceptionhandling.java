/**
 * Java Exceptions:
 * syntax:
 * try{
 * // code
 * }catch(Exception e){
 *  // exception handle code
 * }
 */

 class Java3401Exceptionhandling{
    public static void main(String[] args) {

        System.out.println("Hello world");
        // java try and catch
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("we got an exception");
        }finally{
            System.out.println("This is from finally block");
        }
        System.out.println("Hello world");

    }

 }

 /**
  * Hello world
we got an exception
Hello world
  */