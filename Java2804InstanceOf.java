/**
 * InstanceOf
 */

 class School{
    String school_name ="ABC";
 }

 class Classes{
    String class_name ="";
 }

 class Students extends Classes{
    String student_name;
    int student_roll_no;

    Students(String name, int roll_no){
        this.student_name = name;
        this.student_roll_no = roll_no;
    }

    void display(){
        System.out.print(this.student_name);
        System.out.println(this.student_roll_no);
    }
 }


 class Java2804InstanceOf{
     public static void main(String[] args) {
        Students stu1 = new Students("A", 1);
        // Students stu2 = new Students("B", 2);
        // Students stu3 = new Students("C", 3);
        // stu1.display();
        // stu2.display();
        // stu3.display();

        System.out.println(stu1 instanceof Students);// true
        System.out.println(stu1 instanceof Classes);// true
        // System.out.println(stu1 instanceof School);

     }
 }


 