import java.util.*;
class US_07_UserFascinatingNumbers {
    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter number : ");
        n = sc.nextInt();

        if (PR_07_FascinatingNumbers.isValid(n)==true){
            PR_07_FascinatingNumbers ob = new PR_07_FascinatingNumbers(n);
            ob.display();
        }
    }
}
