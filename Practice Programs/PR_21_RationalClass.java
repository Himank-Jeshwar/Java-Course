import java.util.Scanner;

class PR_21_RationalClass {
    int numerator,denominator,nr,dr;
    
    PR_21_RationalClass(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void simplify(){
        nr = numerator/gcd();
        dr = denominator/gcd();
    }

    int gcd(){
        int gcd = 1;
        for (int i = numerator*denominator;i>=1;i--){
            if (numerator%i==0&&denominator%i==0){
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    void print(){
        System.out.println("Orginal fraction : "+numerator+"/"+denominator);
        System.out.println("Simplified fraction : "+nr+"/"+dr);
    }

    public static void main(String[] args) {
        int n,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator : ");        
        n = sc.nextInt();
        System.out.print("Enter denominator : ");
        d = sc.nextInt();

        PR_21_RationalClass ob = new PR_21_RationalClass(n,d);
        ob.simplify();
        System.out.println("GCD : "+ob.gcd());
        ob.print();
    }
}
