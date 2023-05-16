import java.util.Scanner;
class EvaluationWithoutOperators {
    static int add (int m,int n){
        return (m-(-n));
    }
    static int product(int m,int n){
        int mul = 0;
        for (int i = 1;i<=n;i++){
            mul+=m;
        }
        return mul;
    }
    static void quotientAndRemainder(int m,int n){
        int quotient = 0,remainder;
        while(m>n){
            m-=n;
            quotient++;
        }
        remainder = m;
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
    }

    public static void main(String[] args) {
        int ch,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to add two numbers\nPress 2 to multiply two numbers\nPress 3 to find quotient and remainder of two numbers\n");
        ch = sc.nextInt();
        System.out.println("Enter two numbers : ");
        m = sc.nextInt();
        n = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Sum - "+add(m,n));
                break;
            case 2:
                System.out.println("Product - "+product(m,n));
                break;

            case 3:
                quotientAndRemainder(m, n);
                break;

            default:
                System.out.println("INVALID INPUT !");
        }
        sc.close();
    }    
}
