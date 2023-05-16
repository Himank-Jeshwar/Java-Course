import java.util.Scanner;
public class Length 
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter length in kilometers = ");
        double kilometers = k.nextDouble();
        double miles = kilometers/1.609;
        System.out.println("Length in miles = "+miles+" mi");
    }
}
