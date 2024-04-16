/**
 * This example is to demonstrate non-parameterized constructor.
 */
class Student{
    // vairables 
    String name;
    String address;
    int age;

    // constructor
    Student(){
        this.name = "GWG";
        this.address = "Agra";
        this.age = 28;
    }
    // main method
    public static void main(String[] args) {
        Student stu = new Student();// this will force constructor to run

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
    28
 */