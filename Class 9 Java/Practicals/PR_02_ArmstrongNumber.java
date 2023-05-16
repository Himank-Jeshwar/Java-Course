import java.util.Scanner;
class ArmstrongNumber {
    int num;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
    }
    int digitCount(int n){
        int c = 0;
        for (;n>0;n/=10,c++);
        return c;
    }

    void display(){
        double sum = 0;
        int copy = num;
        while (copy>0){
            sum+=Math.pow((copy%10), digitCount(num));
            copy/=10;
        }
        if (sum==num)
            System.out.println(num+" is an armstrong number.");
        else 
            System.out.println(num+" is not an armstrong number.");
    }
    public static void main(String[] args) {
        ArmstrongNumber armNum = new ArmstrongNumber();
        armNum.input();
        armNum.display();
    }
}
