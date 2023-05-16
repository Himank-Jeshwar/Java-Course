import java.util.*;
class PR_19_Frequency {
    public static void main(String[] args) {
        // declaration
        String str; int c = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");

        while (true){
            str = sc.next();
            if (str.equals("the"))
                c++;
            else if (str.equals("."))
                break;
        }

        System.out.println("Frequency of token \"the\" = "+c);
    }
}
