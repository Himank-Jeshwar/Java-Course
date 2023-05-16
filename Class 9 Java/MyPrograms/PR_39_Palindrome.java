import java.util.*;
class PR_39_Palindrome {
    public static void main(String[] args) {
        int rev = 0,n,copy;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        copy = n;
        while (copy>0){
            rev = rev*10+copy%10;
            copy/=10;
        }
        if (rev==n)
            System.out.println("A Palindrome number");
        else 
            System.out.println("Not a Palindrome number");
    }
}
