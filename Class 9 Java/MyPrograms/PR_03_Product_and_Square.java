import java.util.*;
public class PR_03_Product_and_Square {
    public static void main(String[] args) {
        // declaration
        double num[] = new double[20];
        double product = 1,sq;

        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 real numbers : ");
        for (int i = 0;i<num.length;i++){
            num[i]=sc.nextDouble();
        }

        for (int j = 0;j<num.length;j++){
            sq = num[j]*num[j];
            System.out.println("Square of "+num[j]+" = "+sq);
            product*=num[j];
        }
        System.out.println("\nProduct of all elements = "+product);
    }
}
