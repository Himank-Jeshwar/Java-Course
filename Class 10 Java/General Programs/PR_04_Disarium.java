import java.util.*;
class PR_04_Disarium {
    boolean isDisarium(int n){
        double s = 0.0; int p = 0;
        for (int i = n;i>0;i/=10,p++); // counting digits
        
        for (int i = n;i>0;i/=10){
            s+=Math.pow(i%10,p);
            p--;
        }
        return (s==n);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        PR_04_Disarium ob = new PR_04_Disarium();

        if (ob.isDisarium(n)==true)
            System.out.println("Disarium number");
        else 
            System.out.println("Not a Disarium number");
    }
}
