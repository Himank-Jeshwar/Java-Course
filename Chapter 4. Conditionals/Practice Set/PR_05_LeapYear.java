import java.util.Scanner;
public class PR_05_LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Year = ");
        int yr = s.nextInt();
        if (yr%4==0) {
            System.out.format("%d is a leap year.",yr);
        }
        else {
            System.out.format("%d is not a leap year.",yr);
        }
    }
}
