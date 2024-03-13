/**
 * WAP to print min and max value for each data type
   MIN_VALUE and MAX_VALUE 

Byte Min and Max  -128 127
Short Min and Max -32768 32767
Integer Min and Max -2147483648 2147483647
Long Min and Max -9223372036854775808 9223372036854775807
Float Min and Max 1.4E-45 3.4028235E38
Double Min and Max 4.9E-324 1.7976931348623157E308
Character Min and Max 

 */
public class primitive_data_type {
    public static void main(String[] args) {
        
        System.out.println("Byte Min and Max  "+Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println("Short Min and Max "+Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println("Integer Min and Max "+Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println("Long Min and Max "+Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println("Float Min and Max "+Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println("Double Min and Max "+Double.MIN_VALUE + " " + Double.MAX_VALUE);
        // System.out.println("Character Min and Max "+Character.MIN_VALUE + " " + Character.MAX_VALUE);
        // System.out.println("Boolean Min and Max "+Boolean.MIN_VALUE + " " + Boolean.MAX_VALUE);// error
    }
    
}
