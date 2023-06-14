import java.util.*;
class Number {
    int n; // declaration
    
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer : ");
        n = sc.nextInt();
    }

    void display(){
        System.out.println("The entered number is : "+n);
    }
}

class Check extends Number{
    int fact,revnum; // declaration

    void find(){
        int factorial = 1; // to store factorial

        // calculating factorial
        for (int i = 1;i<=n;i++){
            factorial*=i;
        }
        // output
        System.out.println(n+"! = "+factorial);
    }

    void palindrome(){
        // declaration and initialization
        int copy = n;
        revnum = 0;

        // reversing the number n
        while (copy>0){
            revnum = revnum*10+copy%10;
            copy/=10;
        }

        // check for palindrome
        if (revnum==n)
            System.out.println("Palindrome number");
        else 
            System.out.println("Not Palindrome number");
    }
}
class PR_07_Number {
    public static void main(String[] args) {
        // instantiation
        Check num = new Check();
        num.input();
        num.display();
        num.find();
        num.palindrome();
    }    
}
