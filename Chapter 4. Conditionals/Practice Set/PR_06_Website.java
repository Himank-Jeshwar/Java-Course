import java.util.Scanner;
public class PR_06_Website {
    public static void main(String[] args) {
        Scanner web = new Scanner(System.in);
        System.out.print("Enter URL = ");
        String url = web.nextLine();
        if (url.endsWith(".com")){
            System.out.println("This website is a Commercial Website. ");
        }
        else if (url.endsWith(".org")){
            System.out.println("This website is an Organisational Website.");  
        }
        else if (url.endsWith(".in")){
            System.out.println("This website is an Indian Website.");
        }
        else {
            System.out.println("Couldn't identify the type of website.");
        }
    }
}
