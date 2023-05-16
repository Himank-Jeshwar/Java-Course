import java.util.Scanner;
public class PR_04_Days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Any Number (1 to 7) to print day name = ");
        int d = s.nextInt();
        switch(d){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter Only from 1 to 7 !");
        }
    }
}
