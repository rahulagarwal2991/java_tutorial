public class increment_decrement {
    public static void main(String[] args) {
        int x = 5;
        // System.out.println(x++);// 5 => 5++ => 5
        // System.out.println(++x);// 6 => ++6 => 7
        // System.out.println(x--);// 7 -> 7-- => 7
        // System.out.println(--x);// 6 -> --6 => 5
        System.out.println( x++ +  ++x );// HW
        System.out.println( --x -  x-- );// HW
    }
}
