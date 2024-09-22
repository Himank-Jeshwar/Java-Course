import java.util.*;

class US_06_UserSmith {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        n = sc.nextInt();

        PR_06_SmithNumber ob = new PR_06_SmithNumber(n);
        ob.display();
    }    
}
