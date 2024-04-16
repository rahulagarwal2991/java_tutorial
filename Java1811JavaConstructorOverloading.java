/**
 * This example is to demonstrate non-parameterized constructor.
 */
class Student{
    // vairables 
    String name;
    String address;
    int age;

    // constructor
    Student(){// non paramterized 2
        this.name = "Ram";
        this.address = "Ayodhya";
        this.age = 5;
    }
    Student(String student_name , String student_add, int student_age){ //1 
        // parameterized with string , string , int
        this.name = student_name;
        this.address = student_add;
        this.age = student_age;
    }

    Student(int student_age){ // 3
        // parameterized with string , string , int
        this.name = "Krishna";
        this.address = "Mathura";
        this.age = student_age;
    }

    Student(String student_add, int student_age){  //4
        // parameterized with string , string , int
        this.name = "Shiva";
        this.address = student_add;
        this.age = student_age;
    }
    // main method
    public static void main(String[] args) {
        Student stu = new Student("GWG", "Agra", 100);// this will force constructor to run
        stu.display();

        Student stu4 = new Student("GWG1", "Agra2", 1003);// this will force constructor to run
        stu4.display();

        Student stu1 = new Student();// 
        stu1.display();

        Student stu2 = new Student(100);// this will force constructor to run
        stu2.display();

        Student stu3 = new Student("Varansi", 10000);// this will force constructor to run
        stu3.display();


    }

    // other methods
    void display(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.age);

    }
    
}

/**
GWG
Agra
100
Ram
Ayodhya
5
Krishna
Mathura
100
Shiva
Varansi
10000
 */