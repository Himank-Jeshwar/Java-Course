import java.util.*;
class PR_13_SpecialAndPalindrome {
    static boolean isPalindrome(String s){
        String rev = "";
        for (int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev.equals(s);
    }

    static boolean isSpecialWord(String s){
        return (s.charAt(0)==s.charAt(s.length()-1));
    }
    public static void main(String[] args) {
        String st;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter word : ");
        st = sc.next().toUpperCase();

        if (isPalindrome(st))
            System.out.println("Palindrome Word");
        else if (isSpecialWord(st))
            System.out.println("Special Word");
        else
            System.out.println("None of them");
    }    
}
