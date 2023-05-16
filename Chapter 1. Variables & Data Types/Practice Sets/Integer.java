import java.util.Scanner;
public class Integer 
{
    public static void main(String[] args) 
    {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter Any Number = ");
        boolean check = i.hasNextInt();
        System.out.println(check);
    }    
}
