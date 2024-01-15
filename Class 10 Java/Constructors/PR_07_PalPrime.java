import java.util.*;
class PR_07_PalPrime {
    int n ;

    public PR_07_PalPrime(int x){
        n = x;
    }   

    boolean check_prime(int p){
        int c = 0;
        for (int i = 1;i<=p;i++){
            if (p%i==0)
                c++;
        }
        return (c==2);
    }

    int reverse(int z){
        int rev = 0;
        while (z>0){
            rev = rev*10+z%10;
            z/=10;
        }
        return rev;
    }

    void display(){
        if (reverse(n)==n) // test for palindrome
            if (check_prime(n)==true) // test for prime
                System.out.println("Prime Palindrome number ");
            else
                System.out.println("Not a Prime Palindrome number");
    }

    public static void main(String[] args) {
        int x ;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : "); 
        x = sc.nextInt();

        PR_07_PalPrime ob = new PR_07_PalPrime(x);
        ob.display();
    }
}
