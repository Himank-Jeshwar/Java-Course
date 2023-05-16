// 2n = Even No. = 0,2,4,6,8,10 .....so on
// 2n + 1 = Odd No = 1,3,5,7,9,11 .....so on
 
package Loops_Programs;
import java.util.Scanner;
public class Quick_Quiz_3 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("Find first n odd numbers :-\n");
        System.out.print("Enter Value of n (Natural Number) = ");
        int num = h.nextInt();
        for (int n = 0; n<num ; n++) {
            System.out.println(2*n+1);
        }
    }
}
