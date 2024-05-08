/**
 * Abstract Class and functions
 * Java2708AbstractClassAndFunctions.java
 * 
 */

 class DB_driver{
     public void getDriver(){
         System.out.println("Type 1 driver");
     }
 }

 class New_db_driver extends DB_driver{
    public void getDriver(){
        System.out.println("Type 2 driver");
    }
 }
class Java2708AbstractClassAndFunctions{
    public static void main(String[] args) {
        New_db_driver new_driver = new New_db_driver();

        DB_driver driver = new_driver;
        driver.getDriver();
    }
}
