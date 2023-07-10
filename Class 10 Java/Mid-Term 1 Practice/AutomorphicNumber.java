import java.util.*;
class AutomorphicNumber {
    public static void main(String[] args) {
        int no_of_digits = 0;
        int n,l,sq,copy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        copy=n;
        // counting digits
        for (;copy>0;copy/=10,no_of_digits++);
        sq = n*n;
        l = (int)(sq%(Math.pow(10,no_of_digits)));
        if (l==n)
            System.out.print("Automorphic number.");
        else 
            System.out.print("Not Automorphic number.");
    }
}
