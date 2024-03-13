public class assignment_operator {
    public static void main(String[] args) {
        int x = 5;
        // + - * / % 
        x += 2;// x = x+2 => x = 5+2 => 7
        System.out.println(x);// 7

        x = 5;
        x -= 2;
        System.out.println(x); // 3

        x = 5;
        x /= 2;
        System.out.println(x); // 2

        x = 5;
        x %= 2;
        System.out.println(x); // 1


    }
}
