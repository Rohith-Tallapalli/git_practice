public class operators {
    public static void main(String[] args) {
        //Rohith T
        // Arithmetic Operators
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 3);
        // Relational Operators
        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(10 >= 10);
        System.out.println(10 <= 5);
        System.out.println(10 == 10);
        System.out.println(10 != 5);
        // Logical Operators
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(!true);
        // Assignment Operators
        int a = 10;
        System.out.println(a);
        a += 5;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
        // Unary Operators
        int b = 10;
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(--b);
        System.out.println(b--);

        // Bitwise Operators
        System.out.println(5 & 3);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(~5);


        // Shift Operators
        System.out.println(8 << 1);
        System.out.println(8 >> 1);
        System.out.println(8 >>> 1);
    }
}