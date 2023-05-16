import java.util.*;
class PR_32_FibonaciSeries {
    public static void main(String[] args) {
        int a = 0,b = 1,c,n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();

        for (int i = 0;i<n;i++){
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }

    }
}
