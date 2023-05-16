import java.io.*;
public class CheckLetter {
    public static void main(String[] args) throws IOException{
        // declaration
        char letter;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an alphabet character = ");
        letter = br.readLine().charAt(0);
        
        if ((int)(letter)>=65&&(int)(letter)<=90)
            System.out.print("The entered alpabet letter is in capital.");
        else 
            if ((int)(letter)>=97&&(int)(letter)<=122)
                System.out.print("The entered alpabet letter is in small.");
            else
                System.out.print("Invalid alphabet character !");
    }

}
