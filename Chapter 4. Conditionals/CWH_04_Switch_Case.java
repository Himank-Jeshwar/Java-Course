import java.util.Scanner;
public class CWH_04_Switch_Case {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("\n\tPress A to Print \"Hello\"\n\tPress B to Print \"Silence\"\n\tPress C to Print \"Listen\"");
        System.out.print("\nEnter Your Choice = ");
        String n = take.next();
        n = n.toUpperCase();
        switch (n){
            case "A":
                System.out.println("Hello");
                break;
            case "B":
                System.out.println("Silence");
                break;
            case "C":
                System.out.println("Listen");
                break;
            default:
                System.out.println("Invalid Input !");    
         
                // ALTERNATE WAY TO WRITE SWITCH CASE 
        // switch (n){
        //     case "A" -> System.out.println("Hello");
        //     case "B" -> System.out.println("Silence");
        //     case "C" -> System.out.println("Listen");
        //     default -> System.out.println("Invalid Input");
        // }
     }
    } 
}
