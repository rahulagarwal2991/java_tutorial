/**
 * Java3001WrapperClass.java
 */
// primitive data types: int , short , long byte , float , double, boolean and char
// Primitive data type -> wrapper classes
// byte                -> Byte     -> java.lang.Byte
// short               -> Short    -> java.lang.Short
// int                 -> Integer
// long                -> Long
// float               -> Float
// double              -> Double
// boolean             -> Boolean
// char                -> Character


class Java3001WrapperClass{

    public static void main(String[] args) {
        int i = 10;// data type
        Integer in = 10;// wrapper class for integer 
        System.out.println(i +" "+ in);

        System.out.println(i +" "+ in.intValue());
        /**
         * 
         * intValue()
         * byteValue()
         * shortValue()
         * doubleValue()
         * charValue()
         * longValue()
         */
    }
}