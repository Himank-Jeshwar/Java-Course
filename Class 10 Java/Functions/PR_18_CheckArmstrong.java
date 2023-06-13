import java.util.*;
class PR_18_CheckArmstrong {
    int isArmstrong(int n){
        int copy = n,sum = 0;
        while (copy>0){
            sum += (int)(Math.pow(copy%10,3));
            copy/=10;
        }
        if (n==sum)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        int n;
        PR_18_CheckArmstrong armstrong = new PR_18_CheckArmstrong();
        
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        if (n>=100&&n<=999){
            if (armstrong.isArmstrong(n)==1)
                System.out.println(n+" is an armstrong number.");
            else 
                System.out.println(n+" is not an armstrong number.");
        }
        else 
            System.out.println("Not a 3-digit number.");
    }    
}
