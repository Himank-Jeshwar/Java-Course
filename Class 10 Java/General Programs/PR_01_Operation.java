import java.util.*;
class PR_01_Operation{
    public static void main(String[] args) {
        double n1,n2,result = 0.0;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        n1 = sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        n2 = sc.nextDouble();
        System.out.print("Enter operator : ");
        op = sc.next().charAt(0);

        result = (op=='+')?n1+n2:(op=='-')?n1-n2:(op=='*')?n1*n2:(op=='/')?n1/n2:0;
        System.out.println("Result = "+result);
    }
}