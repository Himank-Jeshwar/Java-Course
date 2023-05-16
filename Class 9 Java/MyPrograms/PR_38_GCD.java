import java.util.*;
class PR_38_GCD {
    public static void main(String[] args) {
        int divisor,dividend,rem=0,n1,n2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 numbers : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        divisor = Math.min(n1, n2);
        dividend = Math.max(n1, n2);
        rem = dividend%divisor;

        while(rem!=0){
            dividend = divisor;
            divisor = rem;
            rem = dividend%divisor;
        }


        System.out.println("GCD = "+divisor);
    }    
}
