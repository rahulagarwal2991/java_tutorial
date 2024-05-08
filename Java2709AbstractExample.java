/**
 * Abstract Class and functions
 * Java2709AbstractExample.java
 * 
 */

 abstract class DB_driver{
     public abstract void getDriver();
 }

 class New_db_driver extends DB_driver{
    public void getDriver(){
        System.out.println("Type 2 driver");
    }
 }
class Java2709AbstractExample{
    public static void main(String[] args) {
        New_db_driver new_driver = new New_db_driver();

        DB_driver driver = new_driver;
        driver.getDriver();
    }
}
