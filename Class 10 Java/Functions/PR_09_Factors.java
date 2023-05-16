import java.util.*;
class PR_09_Factors{
    static boolean isFactor(int a,int b){ 
        return (a==b*(a/b));
    }
    
    public static void main(String[] args) {
       int m,n,num; // declaration

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
       num = sc.nextInt();
       System.out.print("Enter lower limit : ");
       m = Math.abs(sc.nextInt());
       System.out.print("Enter upper limit : ");
       n = Math.abs(sc.nextInt());

       m = Math.min(m,n);
       n = Math.max(m,n);

       System.out.println("Factors of "+num+":");
       for (int i = m;i<=n;i++){
            if (isFactor(num, i))
                System.out.print(i+" ");    
    }
}
}