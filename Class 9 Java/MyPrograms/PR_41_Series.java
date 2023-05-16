import java.util.*;
class PR_41_Series{
    public static void main(String[] args) {
        int n;
        double s = 0.0,a = 2.0,b = 3.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();

        for (int i = 0;i<n;i++,a*=2,b+=2){
            s+=(a/b);
        }
        System.out.println("S = "+s);
    }
}