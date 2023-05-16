import java.util.Scanner;
public class Comparison 
{
    public static void main(String[] args) 
    {   
        int givenNo = 45; 
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int userNo = n.nextInt();
        boolean comp = givenNo > userNo;
        System.out.println("Answer = "+comp);
    }    
}
