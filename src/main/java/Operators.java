/**
 * Created by eric.manuguerra on 17.05.2015.
 */
public class Operators {

    public static void main(String[] args) {
        testOne();
        testTwo();
        testThree();
    }

    private static void testThree() {
        int x = (int) 1.0; // Compiles
        short y = (short) 1921222;  // Compiles, is stored as 20678
        int z = (int) 9f;  // Compiles
        long t = 192301398193810323L;  // Compiles
        System.out.println(x + " " + y + " " + z + " " + t);
    }

    private static void testTwo() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println(x + " " + y);
    }

    private static void testOne() {
        short x = 10;
        short y = 3;
        // Promotion to int - prints ou 3
        System.out.println(x / y);
    }
}
