package folder.folderL1.folderL2;
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name - ");
        name = sc.nextLine();

        System.out.print("Good morning, "+name);
        sc.close();
    }
}
