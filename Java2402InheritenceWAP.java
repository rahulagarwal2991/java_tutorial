// Java2402InheritenceWAP

class Employee{
    String e_id;
    String e_name;
    String e_address;
    
    public void getEmployeeDetails(){
        System.out.println(e_id);
        System.out.println(e_name);
        System.out.println(e_address);
    }
}

class Manager extends Employee{

    Manager(String e_id1, String e_name1, String e_address1){
        e_id = e_id1;
        e_name = e_name1;
        e_address = e_address1;
    }

    public void getManagerDetails(){
        getEmployeeDetails();
    }
    
}

class Accounts extends Employee{
    Accounts(String e_id1, String e_name1, String e_address1){
        e_id = e_id1;
        e_name = e_name1;
        e_address = e_address1;
    }

    public void getManagerDetails(){
        getEmployeeDetails();
    }
}

class Java2402InheritenceWAP {

    public static void main(String[] args) {
        Manager m = new Manager("1-a", "Utkarsh", "SSE");
        m.getManagerDetails();

        Accounts a = new Accounts("1-b", "Utkarsh", "CA");
        a.getManagerDetails();
    }
}