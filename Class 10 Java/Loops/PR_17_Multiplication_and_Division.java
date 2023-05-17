import java.util.Scanner;

class PR_17_Multiplication_and_Division {
    static void multiply(int a,int b){
        int mul = 0;
        for (int i = 0;i<b;i++){
            mul+=a;
        }
        System.out.println("Product : "+mul);
    }

    static void divide(int a,int b){
        int dividend = Math.max(a, b);
        int divisor = Math.min(a, b);
        int quotient = 0,rem;
        do{
            dividend-=divisor;
            quotient++;
        }while(dividend>=divisor);

        rem = dividend;

        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder : "+rem);
    }
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for multiplication\nPress 2 for division");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Enter two numbers : ");
                a = sc.nextInt();
                b = sc.nextInt();
                multiply(a, b);
                break;
            case 2:
                System.out.print("Enter dividend : ");
                a = sc.nextInt();
                System.out.print("Enter divisor : ");
                b = sc.nextInt();
                divide(a, b);
                break;
            default:
                System.out.println("Invalid Input!");
        }
        sc.close();
    }    
}
