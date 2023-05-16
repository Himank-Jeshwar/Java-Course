import java.util.Scanner;
public class Greet 
{
    public static void main(String[] args) 
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String name = n.nextLine();
        System.out.print("Hello "+name+", have a good day");
    }    
}
