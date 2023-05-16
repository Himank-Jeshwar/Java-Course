import java.util.Scanner;
public class PR_03_IncomeTax {
    public static void main(String[] args) {
        Scanner c = new Scanner (System.in);
        float inc,tax = 0.0f;
        System.out.print("Enter Your Income = ");
        inc = c.nextFloat();
        if (inc <= 250000.0f){
            tax += 0.0f;
        }
        else if (inc > 250000.0f && inc <= 500000.0f){
            tax += 0.05f*(inc-250000.0f);
        }
        else if (inc > 500000.0f && inc <=1000000.0f){
            tax += 0.05f*(500000.0f-250000.0f);
            tax += 0.2f*(inc-500000.0f);
        }
        else if (tax>1000000.0f){
            tax += 0.05f*(500000.0f-250000.0f);
            tax += 0.2f*(1000000.0f-500000.0f);
            tax += 0.3f*(inc - 1000000.0f);
        }
        System.out.print("Tax to be paid = "+tax);    
    }
}
