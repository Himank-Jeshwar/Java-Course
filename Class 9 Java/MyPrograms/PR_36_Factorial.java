import java.util.*;
class PR_36_Factorial{
    public static void main(String[] args) {
        int factorial = 1,n;

        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            System.out.print("Enter number : ");
            n = sc.nextInt();
            for (int j = 1;j<=n;j++)
                factorial*=j;
            System.out.println(n+"!="+factorial);
            factorial = 1;
        }
    }
}