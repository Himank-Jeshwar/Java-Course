import java.util.*;
class US_08_UserSearch {
    public static void main(String[] args) {
        double n;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter element : ");
        n = sc.nextDouble();

        PR_08_Searching ob = new PR_08_Searching(n);
        ob.display();
    }
}
