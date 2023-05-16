import java.util.Scanner;
class PrintFactors {
    int n;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt();
        if (n>0&&n<20)
            display();
        else
            System.out.print("OUT OF RANGE");
    }

    void display(){
        System.out.println("FACTORS :");
        for (;n<=20;n++){
            System.out.print(n+" = ");
            for (int j = 1;j<=n;j++)
                if (n%j==0)
                    System.out.print(j+" ");
            System.out.println();}
    }
    public static void main(String[] args) {
        PrintFactors factors = new PrintFactors();
        factors.input();
    }    
}
