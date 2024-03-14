public class Java0802implicitTypeCasting {
    public static void main(String[] args) {
        int i = 10;
        byte b = i;// range of byte -128 to 127
        System.out.println(b);

    }
}


// inplicitTypeCasting0802.java:4: error: incompatible types: possible lossy conversion from int to byte
//         byte b = i;
//                  ^
// 1 error