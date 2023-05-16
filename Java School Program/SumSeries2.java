import java.util.Scanner;
class SumSeries2{
    int n,x;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for n : ");
        n = sc.nextInt();
        System.out.print("Enter x :");
        x = sc.nextInt();
        sc.close();
    }  

    void display(){
        double sum = 0;
        for (int i = 1,j = 1;j<=n;i+=2,j++){
            if (j%2==0)
                sum-=Math.pow(x,j)/i;
            else
                sum+=Math.pow(x,j)/i;
        }
        System.out.printf("Sum of series = %.3f",sum);
    }
    public static void main(String[] args) {
        SumSeries2 ss = new SumSeries2();
        ss.input();
        ss.display();
    }
}