import java.util.*;
class PR_04_DecimalToBinary {
    int decimal;
    String binary;

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a decimal : ");
        decimal = sc.nextInt();
    }

    void  convertToBinary(){
        int dividend = decimal;
        binary = "";

        while(dividend!=1){
            binary = dividend%2+binary;
            dividend/=2;
        }

        binary = '1'+binary;
        System.out.println("Binary Equivalent is : "+binary);
    }

    
    public static void main(String[] args) {
        PR_04_DecimalToBinary ob = new PR_04_DecimalToBinary();
        ob.input();
        ob.convertToBinary();
    }
}
