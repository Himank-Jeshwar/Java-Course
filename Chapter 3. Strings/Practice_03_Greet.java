import java.util.Scanner;
public class Practice_03_Greet {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String name = y.nextLine();
        String greet = "Dear <|name|>, Thanks a lot";
        String finalgreet = greet.replace("<|name|>",name);
        System.out.print(finalgreet);
    }
}
