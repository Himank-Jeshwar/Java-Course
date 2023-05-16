import java.util.Scanner;

class AmicableNumber {
    int n1,n2;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :- ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
    }
    int sumofFactors(int n){
        int sum = 0;
        for (int i = 1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        AmicableNumber amicableNumber = new AmicableNumber();
        amicableNumber.input();
        int n1 = amicableNumber.n1;
        int n2 = amicableNumber.n2;
        if (amicableNumber.sumofFactors(n1)==n2&&amicableNumber.sumofFactors(n2)==n1)
            System.out.print("("+n1+","+n2+") are amicable numbers.");
        else
            System.out.print("("+n1+","+n2+") is not an amicable number.");
    }
}
