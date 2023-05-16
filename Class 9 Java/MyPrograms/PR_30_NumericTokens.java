import java.util.*;
class PR_30_NumericTokens {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        s = sc.nextLine();

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)>='0'&&s.charAt(i)<='9')
                System.out.print(s.charAt(i));
            
            if (s.charAt(i)==' ')
                System.out.print(s.charAt(i));
        }
    }
}
