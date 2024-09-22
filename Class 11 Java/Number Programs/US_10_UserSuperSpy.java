import java.util.*;
class US_10_UserSuperSpy {
    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        PR_10_SuperSpyNumber ob = new PR_10_SuperSpyNumber(n);
        ob.display();
    }   
}
