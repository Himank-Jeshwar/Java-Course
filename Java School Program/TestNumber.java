import java.util.Scanner;

class TestNumber {
    public static void main(String[] args) {
        int num,sum = 0 ,product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        num = sc.nextInt();
        sum = (num%10)+(num/10)%10;
        product = (num%10)*((num/10)%10);
        if (sum+product==num)
            System.out.println("Special 2 - digit number ");
        else
            System.out.println("Not a special two - digit number ");
        sc.close();
    }
}
