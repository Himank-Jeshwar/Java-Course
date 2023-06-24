import java.util.*;
class ASG_8_SpecialTwoDigit {
    boolean isSpecialTwoDigit(int n){
        // declaration
        int sumOfDigits = 0,sum = 0,prod = 1,copy = n;
        
        // calculating sum and product of digits
        while (copy>0){
            sumOfDigits+=copy%10;
            prod*=copy%10;
            copy/=10;
        }

        sum = sumOfDigits+prod;
        return (sum==n);
    }
    public static void main(String[] args) {
        int n; // declaration
        ASG_8_SpecialTwoDigit sp = new ASG_8_SpecialTwoDigit();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two digit number : ");
        n = Math.abs(sc.nextInt()); 

        // check for 2-digit number
        if (!(n>=10&&n<=99)){
            System.out.println("The number must be two digit.");
            System.exit(0);  
        }

        // check for special 2-digit number
        if (sp.isSpecialTwoDigit(n))
            System.out.println("Special two-digit number");
        else 
            System.out.println("Not a special two-digit number.");
    }    
}