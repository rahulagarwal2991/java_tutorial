/**
 * object cloning
 * java.lang.Cloneable
 */

 class Student implements Cloneable{
     String sid;
     String sname;

     Student(String sid, String sname){
         this.sid = sid;
         this.sname = sname;

     }

     public Object clone() throws CloneNotSupportedException{
        return super.clone();
     }

     public String toString(){
        System.out.println("The data for strudnet is ");
        System.out.println("");
        System.out.println("Student id : "+ sid);
        System.out.println("Student name : "+sname);
        return "";
     }
 }

 class Java2805ObjectCloning {
     public static void main(String[] args) {
         Student s1 = new Student("st-0011", "karan");
         System.out.println("Student details 1");
         System.out.println(s1);

        
        try{
            Student s2 = (Student)s1.clone();
            System.out.println("Student details 2");
            s2.sid = "s-1112";
            s2.sname = "ram";
            System.out.println(s2);

            System.out.println(s1);
        }catch(CloneNotSupportedException e){
            System.out.println("clone not supported exception");   
        }

        Student s3 = (Student)s1;
        s3.sid = "s-0001";
        s3.sname = "shyam";
        System.out.println("--------");
        System.out.println(s1);
        // System.out.println(s2);
        System.out.println(s3);

     }

 }



    // public void println(Object x){
    // String s = String.valueOf(x);
    // synchronized (this){
    //     print(s);
    //     newline();
    // }
    // }
    // public static String valueOf(Object x){
    //     return (obj==null)? "null":obj.toString();
    // }
    // }

    /**
     * 1. shallow cloning
     * 2. deep cloning
     */


     class School{


     }

     class Student extends School{

        
     }

     Student s1 = new Student();
     
     Student s2 =(Student)s1.clone();

     // shallow clonig -> only clone of student will be done
    // deep cloning    -> along with student we will also clone School 