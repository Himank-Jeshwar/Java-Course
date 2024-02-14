import java.util.*;
class PR_27_Series{
    public static void main(String[] args) {
        int n,s = 1,a=2,sm=1;
        String t = "1";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        n = sc.nextInt();

        for (int i = 1;i<n;i++){
            for (int j = 1;j<=i;j++){
                s+=a;
                a++;
            }
            sm+=s;
        }

        System.out.println(sm);
    }
}