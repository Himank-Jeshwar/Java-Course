/**
 * SwappingWith3rdVariable
 */
public class SwappingWith3rdVariable {

    public static void main(String[] args) {
        // a = 89 , b = 77
        // Swap by using third variable
        int a = 89 , b = 77;
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.print("a = "+a+" , b = "+b);

    }
}