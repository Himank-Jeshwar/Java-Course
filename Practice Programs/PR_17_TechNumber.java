import java.util.Scanner;
public class PR_17_TechNumber {
    public static void main(String[] args) {
    // declaration
    int num,noOfDigits = 1,i = 1; String msg;
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number = ");
    num = sc.nextInt();
        
    // counting number of digits in the number
    for (int n = num/10;n!=0;n/=10){
        noOfDigits+=1;
    } 
    for (int x = 1;x<=noOfDigits/2;x++){
        i*=10;
    }
    msg = (noOfDigits%2==0&&(num/i+num%i)*(num/i+num%i)==num)?num+" is a tech number.":num+" is not a tech number.";
    System.out.print(msg);
    }
}
