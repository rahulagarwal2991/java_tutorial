/**
 * This example is to demonstrate instance block
 */
class Student{
    // vairables 
    String name;
    String address;
    int age;

    // instance block 
    {
        System.out.println("inside instance block");

    }
    // constructor
    Student(){
        this(10);
        this.display();
        System.out.println("inside constructor block");
        this.name = "Ram";
        this.address = "Ayodhya";
        this.age = 5;
        this.display();
       
    }

    Student(int student_age){ // 3
        // parameterized with string , string , int
        this.name = "Krishna";
        this.address = "Mathura";
        this.age = student_age;
    }

    // main method
    public static void main(String[] args) {
        Student stu = new Student();
    }


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