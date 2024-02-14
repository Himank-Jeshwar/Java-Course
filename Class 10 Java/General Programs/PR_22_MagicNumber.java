import java.util.*;
class PR_22_MagicNumber {
    public static void main(String[] args) {
        int n,copy,s=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        copy = n; // storing a copy

        while (s!=1&&copy>9){
            s = 0;
            while (copy>0){ // calculates sum
                s+=copy%10;
                copy/=10;
            }
            copy = s;
        }

        if (s==1)
            System.out.println(n+" is a Magic number.");
        else    
            System.out.println(n+" is NOT a Magic number.");
    }
}
