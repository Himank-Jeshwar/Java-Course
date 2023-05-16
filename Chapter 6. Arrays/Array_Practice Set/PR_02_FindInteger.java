import java.util.Scanner;
public class PR_02_FindInteger {
    public static void main(String[] args) {
        int [] numbers = {34,56,12,88,-33,-90,-99,78,54,-79,80,-134};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer = ");
        int n = sc.nextInt();
        boolean isThere=false;
        for (int el : numbers){
            if (el==n){
                isThere=true;
                break;
            }
            else {
                isThere=false;
            }
        }
        if (isThere==true){
            System.out.format("The number '%d' present in the array.",n);
        }
        else {
            System.out.format("The number '%d' not present in the array.",n);
        }
    }
}
