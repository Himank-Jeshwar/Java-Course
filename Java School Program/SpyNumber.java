import java.util.Scanner;
class SpyNumber {
    static int productOfDigits(int n){
        int product = 1;
        while (n>0){
            product*=(n%10);
            n/=10;
        }
        return product;
    }
    static int sumOfDigits(int n){
        int sum = 0;
        while (n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        num = sc.nextInt();
        if (sumOfDigits(num)==productOfDigits(num))
            System.out.println(num+" is a spy number.");
        else
            System.out.println(num+" is not a spy number.");
        sc.close();
    }    
}
