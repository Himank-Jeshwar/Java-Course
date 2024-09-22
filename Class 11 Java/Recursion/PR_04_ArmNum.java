import java.util.*;
class PR_04_ArmNum {
    int n,l;
    
    public PR_04_ArmNum(int nn){
        n = nn;
        l = (int)(Math.log(n)/Math.log(10))+1;
    }

    int sum_pow(int i){
        if (i==0)
            return 0;
        else 
            return sum_pow(i/10)+(int)Math.pow(i%10,l);
    }

    void isArmstrong(){
        if (sum_pow(n)==n)
            System.out.println(n+" is An Armstrong Number.");
        else
            System.out.println(n+" is not an Armstrong number.");
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        PR_04_ArmNum ob = new PR_04_ArmNum(n);
        // System.out.println("length = "+ob.l);
        // System.out.println("sum = "+ob.sum_pow(n));
        ob.isArmstrong();
    }
}
