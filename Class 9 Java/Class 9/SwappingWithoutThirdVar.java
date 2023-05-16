public class SwappingWithoutThirdVar {
    public static void main(String[] args) {
        int a = 67 , b = 89;
        // swapping the value of a and b
        /* Method 1
        a+=b;
        b = a-b;
        a = a-b;
        */

        // Method 2
        a*=b;
        b = a/b;
        a = a/b;

        System.out.print("a = "+a+"\nb = "+b);
    }
}
