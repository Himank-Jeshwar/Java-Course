/**
 * Swap
 */
public class Swap {
    public static void main(String[] args) {
        // a = 56 , b = 78
        // Swapping without third variable
        int a = 56 , b = 78;
        b+=a;
        a = b-a;
        b = b-a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}