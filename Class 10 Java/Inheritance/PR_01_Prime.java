import java.util.*;
class PR_01_Prime{
    private int n;
    
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }

    void checkPrime(){
        int flag = 0;
        for (int i = 2;i<=n/2;i++){
            if (n%i==0&&n!=2){
                System.out.println("Not a prime number");
                flag = 1;
            }
        }

        if (flag==0) 
            System.out.println("Prime number.");
    }

    public static void main(String[] args) {
        PR_01_Prime prime = new PR_01_Prime();
        prime.input();
        prime.checkPrime();   
    }
}