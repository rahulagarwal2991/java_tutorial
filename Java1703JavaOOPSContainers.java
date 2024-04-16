/**
 * 
 * Containers in java:
 * 1. class 
 * 2. Abstract class
 * 3. interface
 * 
 * 1. class 
 * 
 * public class calculator{
 * 
 * }
 * 
 * syntax:
 * [accessModifer] class classname [extends super_class] [implements super_interface]{
 * variables
 * methods
 * constructor
 * blocks
 * classes
 * abstract class 
 * interface
 * enums
 * }


what is access modifer?
1. public 
2. protected
3. private
4. <default>

Access modifer over classes: 
protected and private are not applicable on classes.

How to create a class in JAVA?
1. class keyword
2. varaiables and methods in the class
3. in main class and in main() method create object.
4. access member of classes by using reference variable.



2. Abstract class : concrete 

concrete method : 
void add(int a, int b)// declaration
{// implementation
// 
    return a+b;
}

Abstract method: have only method declaration
abstract void add(int a, int b);// declaration


abstract class clculator{
    ... 
    abstract void add(int a, int b);


    void addition(int a, int b)// declaration
    {// implementation
    // 
        return a+b;
    }

}

3. interface : 

    interface clculator{
        abstract void add(int a, int b);

    }
 */