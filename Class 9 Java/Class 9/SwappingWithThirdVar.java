public class SwappingWithThirdVar {
    public static void main(String[] args) {
        int a = 32, b = 67, temp;
        temp = b;
        b = a;
        a = temp;
        System.out.print("a = "+a+"\nb = "+b);
    }
}
