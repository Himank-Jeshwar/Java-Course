import java.util.Scanner;

public class CWH_02_InputStrings {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        // String str = st.next(); // reads only first word of string
        String str = st.nextLine(); // reads whole line of string
        System.out.println(str);
    }
}
