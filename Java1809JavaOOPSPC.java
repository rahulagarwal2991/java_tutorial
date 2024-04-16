/**
 * This example is to demonstrate non-parameterized constructor.
 */
class Student{
    // vairables 
    String name;
    String address;
    int age;

    // constructor
    Student(String student_name , String student_add, int student_age){
        this.name = student_name;
        this.address = student_add;
        this.age = student_age;
    }
    // main method
    public static void main(String[] args) {
        Student stu = new Student("GWG", "Agra", 100);// this will force constructor to run

        stu.display();
    }

    // other methods
    void display(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.age);

    }
    
}

/**
 * when constructor is commented 
 *  null
    null
    0
 * when its uncommented
 *  GWG
    Agra
    100
 */