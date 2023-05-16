import java.util.*;
class PR_05_DayMonth {
    public static void main(String[] args) {
        // declaration
        int days,month;
        
        // input
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter days : ");
        days = sc.nextInt();

        // calculation
        month = days/30;
        days = days%30;

        // output
        System.out.println(month+" month(s) "+days+" day(s)");
    }    
}
