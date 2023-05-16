import java.util.*;

public class ASG_4_GCD {
    int a,b;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void findGCD(){
        int ans = 1;
        for (int i = a*b;i>0;i--){
            if (a%i==0&&b%i==0){
              ans = i;
              break;
            }
        }
        System.out.println("G.C.D = "+ans);
}
    public static void main(String[] args) {
      ASG_4_GCD gcd = new ASG_4_GCD();
      gcd.accept();
      gcd.findGCD();
      }
  
}