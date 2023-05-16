import java.util.Scanner;
class PR_01_Multiplesof11 {
   int remainder (int dividend,int divisor){
        int rem = dividend;
        while (rem>=divisor){
            rem-=divisor;
        }
        return rem;
   } 
   public static void main(String[] args) {
        // declaration
        int start,end;
        PR_01_Multiplesof11 multiples = new PR_01_Multiplesof11();

        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start value :");
        start = sc.nextInt();
        System.out.print("Enter end value : ");
        end = sc.nextInt();

        // display
        System.out.println("Multiples of 11 between "+start+" and "+end+" :=");
        for (;start<=end;start++){
            if (multiples.remainder(start, 11)==0)
                System.out.println(start);
        }
   }
}
