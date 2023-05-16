import java.util.*;
class PR_28_CountCase {
    public static void main(String[] args) {
        // declaration
        String s;
        int lower = 0,upper = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below :- ");
        s = sc.nextLine();

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)>='A'&&s.charAt(i)<='Z')
                upper++;
            else if (s.charAt(i)>='a'&&s.charAt(i)<='z')
                lower++;
        }

        System.out.println("Number of lowercase : "+lower);
        System.out.println("Number of uppercase : "+upper);
    }    
}
