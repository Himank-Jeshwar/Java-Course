import java.util.*;
class ASG_5_Series {
    public static void main(String[] args) {
        int t,n,s=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter t (5 to 10) : ");
        t = sc.nextInt();
        System.out.print("Enter n (2 to 10): ");
        n = sc.nextInt();

        if (!(t>=5&&t<=10)||!(n>=2&&n<=10)){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }

        for (int i = 0;i<=t;i++){
            if (i%2==0)
                s+=Math.pow(n,i);
            else
                s-=Math.pow(n,i);
        }

        System.out.println("Sum = "+s);
    }    
}
