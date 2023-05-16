import java.util.Scanner;

class PalindromeCheck {
    static boolean isPalindrome(int n){
        int rev = 0;
        int copy = n;
        while (n>0){
            rev = rev*10+(n%10);
            n/=10;
        }
        return (rev==copy);
    }
    
    public static void main(String[] args) {
        int num; // declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        if (num<=0){
            System.out.println("Number must be non negative !");
            System.exit(0);
        }
        if (isPalindrome(num))
            System.out.println("Palindrome Number.");
        else 
            System.out.println("Not Palindrome Number.");
        
    }
}
