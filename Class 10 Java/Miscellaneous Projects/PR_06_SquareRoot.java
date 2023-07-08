import java.util.*;

class PR_06_SquareRoot {
    static int findNearestSqrt(double n) {
        int i = 0;
        while (true) {
            if (i * i <= n && (i + 1) * (i + 1) > n)
                return i;
            i++;
        }
    }

    static double sqroot (double n,int decimal_places){
        if (n<0){
            System.out.println("NaN");
            System.exit(0);
        }
        String root = findNearestSqrt(n)+".";
        int k = findNearestSqrt(n);
         // decimal places
        int divisor = k,quotient = 0;
        double sqrt = 0,dividend = n,rem;
        
        rem = dividend - (k*k);
        dividend = rem*100;

        while (decimal_places>0){    
            for (int i = 0;i<10;i++){
                if ((k*2*10+i)*i<=dividend && (k*2*10+(i+1))*(i+1) > dividend){
                    divisor = k*2*10+i;
                    quotient = i;
                    break;
                }
            }

            rem = dividend%divisor;
            dividend = rem*100;
            
            k = k*10+quotient;
            root+=quotient;

            decimal_places--;
        }

        sqrt = Double.parseDouble(root);
        return sqrt;
    
    }

    static double sqroot (double n){
        if (n<0){
            System.out.println("NaN");
            System.exit(0);
        }
        String root = findNearestSqrt(n)+".";
        int k = findNearestSqrt(n);
        int decimal_places = 3; // decimal places
        int divisor = k,quotient = 0;
        double sqrt = 0,dividend = n,rem;
        
        rem = dividend - (k*k);
        dividend = rem*100;

        while (decimal_places>0){    
            for (int i = 0;i<10;i++){
                if ((k*2*10+i)*i<=dividend && (k*2*10+(i+1))*(i+1) > dividend){
                    divisor = k*2*10+i;
                    quotient = i;
                    break;
                }
            }

            rem = dividend%divisor;
            dividend = rem*100;
            
            k = k*10+quotient;
            root+=quotient;

            decimal_places--;
        }

        sqrt = Double.parseDouble(root);
        return sqrt;
    
    }

public static void main(String[] args) {
        System.out.println(sqroot(-1)); // manual function
        // System.out.println(Math.sqrt(-1)); // built in function
        System.out.println("9");
        // 1.41
    }
}
