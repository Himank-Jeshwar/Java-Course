import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String args[])throws IOException,InterruptedException{
        // MovieTicket ob = new MovieTicket();
        Scanner sc = new Scanner (System.in);
        
        Admin admin = new Admin();
        User user = new User();
        int ch;
        while(true){
            Menu.mainMenu();
            ch = sc.nextInt();
            
            switch(ch){
                case 1:
                    admin.login();
                    break;

                case 2:
                    user.login();
                    break;

                case 3:
                    user.signUp();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("INVALID CHOICE");

            }
        }    
    }
}
