import java.util.*;
class PR_01_Prime{
    private int n; // declaration
    
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }

    void checkPrime(){
        int flag = 0; // if flag is 0 then prime else not

        for (int i = 2;i<=n/2;i++){
            if (n%i==0&&n!=2){
                System.out.println("Not a prime number");
                flag = 1; // changing flag
            }
        }

        // checking condition
        if (flag==0) 
            System.out.println("Prime number.");
    }

    public static void main(String[] args) {
        // instantiation and invocation
        PR_01_Prime prime = new PR_01_Prime();
        prime.input();
        prime.checkPrime();   
    }
}