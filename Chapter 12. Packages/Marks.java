import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        double marks = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks = ");
        marks = sc.nextDouble();
        sc.close();
        System.out.println("Your marks out of 100 = "+marks);
    }
}
