public class bitwise_operator {
    public static void main(String[] args) {
        int a= 10;// 1010
        int b = 2;// 0010
        System.out.println(a&b); // 0010 // 2
        System.out.println(a|b); // 1010 // 10
        System.out.println(a^b); // 1000 // 8
        System.out.println(a<<b); // 00001010 << 2 => 00101000 -> 40
        System.out.println(a>>b); // 0011 >> 2 => 0000 -> 0
        System.out.println(3>>2); // 0011 >> 2 => 0000 -> 0
    }
}
/**
 * a    b   a&b     a|b     a^b
 * 1    1   1       1       0
 * 1    0   0       1       1
 * 0    1   0       1       1
 * 0    0   0       0       0
 */
/**
 * 0 => 0000
 * 1 => 0001
 * 2 => 0010
 * 3 => 0011
 * 4 => 0100
 * 5 => 0101
 * 6 => 0110
 * 7 => 0111
 * 8 => 1000
 * 9 => 1001
 * 10=> 1010
 * << 
 * >>
 * 
 * value [operator] no of elements we need shift
 * 10 left shift operator 2
 * 10 << 2
 * 00001010 << 2 => 00101000
 * 3 >> 2 -> 0011 >> 2
 * 
 * 
 * 15 << 2
 * 20 >> 3
 */
 