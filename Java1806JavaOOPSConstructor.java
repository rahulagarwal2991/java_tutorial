class Java1806JavaOOPSConstructor{
    // vairables 
    int num = 10;

    // constructor

    // main method
    public static void main(String[] args) {
        Java1806JavaOOPSConstructor jjoc = new Java1806JavaOOPSConstructor();

        jjoc.display();
    }

    // other methods
    void display(){
        int num = 20;// 
        System.out.println(num);// 20
        System.out.println(this.num);//10 

    }

}

/**
 * 
 * here this is reffering to class object
 * what is return type ?
 * 
 * 
 */