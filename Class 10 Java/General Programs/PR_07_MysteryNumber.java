import java.util.*;
class PR_07_MysteryNumber{
    int reverse(int n){
        int rev = 0;
        while (n>0){
            rev = rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        int n;
        boolean flag = false;
        PR_07_MysteryNumber ob = new PR_07_MysteryNumber();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        
    
        for (int i = 1;i<n;i++){
            if (ob.reverse(i)==n-i){
                 flag = true;
                 break;
            }
        }
        
        if (flag==true)
            System.out.println(n+" is a mystery number ");
        else 
            System.out.println(n+" is NOT a mystery number "); 
    }
}