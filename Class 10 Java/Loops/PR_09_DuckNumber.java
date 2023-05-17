import java.util.*;
class PR_09_DuckNumber {
    boolean isDuckNum(int n){
        while (n>0){
            if (n%10==0)
                return true;
            n/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        PR_09_DuckNumber obj = new PR_09_DuckNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        if (obj.isDuckNum(n))
            System.out.println("It is a Duck number.");
        else 
            System.out.println("It is not a Duck Number.");
        sc.close();
    }
}
