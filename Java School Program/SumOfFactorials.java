import java.util.Scanner;
class SumOfFactorials {
    static double factorial(int num){
        int fact = 1;
        for (int i = 1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n; double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n = ");
        n = sc.nextInt();     
        sc.close();

        // calculating sum
        for (int i = 1;i<=n;i++){
            sum+=i/factorial(i);
        }   

        // output
        System.out.printf("Sum of series = %.5f",sum);
    }       
}
