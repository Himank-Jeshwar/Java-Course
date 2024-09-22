import java.util.*;
class PR_05_Disarium {
    int num,size;

    public PR_05_Disarium(int nn){
        num = nn;
        size = 0;
    }

    void countDigit(){
        size = (num+"").length();
    }

    int sumofDigits(int n ,int p){
        if (n==0)
            return 0;
        return (int)(Math.pow(n%10,p))+sumofDigits(n/10, p-1);
    }

    void check(){
        
        countDigit();

        if (sumofDigits(num, size)==num)
            System.out.println(num+" is a Disarium number.");
        else 
            System.out.println(num+" is NOT a Disarium number.");
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        PR_05_Disarium ob = new PR_05_Disarium(n);
        ob.check();
    }
}
