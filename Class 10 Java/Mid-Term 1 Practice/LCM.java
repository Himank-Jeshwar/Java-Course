import java.util.*;
class LCM {

    int lcm(int a,int b){
        int rem,dividend,divisor,lcm;
        int gcd;
        dividend = Math.max(a,b);
        divisor = Math.min(a,b);
        rem = dividend%divisor;
        
        // calculating gcd
        while(rem!=0){
            dividend = divisor;
            divisor = rem;
            rem = dividend%divisor;
        }

        gcd = divisor;
        lcm = a*b/gcd;
        return lcm;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner (System.in);
        LCM l = new LCM();
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.print("L.C.M = "+l.lcm(a,b));
    }
}
