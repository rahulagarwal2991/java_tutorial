class Student{
    
    static int order= 0;
    int roll_no = 0;

    void printRollNo(){
        order= order + 1;
        roll_no = order;// for next student
        System.out.println(roll_no);   
    }
}

class Java2005JavaStaticWAP{

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.printRollNo();
        
        Student stu2 = new Student();
        stu2.printRollNo();

        Student stu3 = new Student();
        stu3.printRollNo();

        Student stu4 = new Student();
        stu4.printRollNo();
    }
}
