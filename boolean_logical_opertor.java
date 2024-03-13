public class boolean_logical_opertor {
    public static void main(String[] args) {
        boolean a;
        boolean b;

        a = true;
        b = true;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        a = true;
        b = false;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        a = false;
        b = true;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);


        a = false;
        b = false;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
}


/**
 * a    b   a&b     a|b     a^b
 * T    T   T       T       F
 * T    F   F       T       T
 * F    T   F       T       T
 * F    F   F       F       F
 */