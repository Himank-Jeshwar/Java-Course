import java.util.*;
class PR_24_AscendingOrderDigits {
    public static void main(String[] args) {
        int n,p=0,sorted = 0,copy,sum = 0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        // sorting the number
        for (int i = 1;i<10;i++){
            copy = n;
            while(copy>0){
                if (copy%10==i)
                    sorted = sorted*10+i;
                copy/=10;
            }
        }

        while(sorted>0){
            sum+=sorted%10*++p;
            sorted/=10;
        }

        System.out.println("Sum = "+sum);
    }
}
