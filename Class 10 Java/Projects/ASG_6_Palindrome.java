import java.util.*;
class ASG_6_Palindrome {
    String s; // declaration

    void input(){
        String palindromes = "";
        int c = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            System.out.print("Enter a word : ");
            s = sc.next();

            if (isPalindrome()){
                palindromes+=s+"\n";
                c++;
            }

        }
        System.out.println("Number of palindromes : "+c);
        System.out.print("Palindrome words are :\n"+palindromes);
    }

    boolean isPalindrome(){
        String rev = ""; // declaration
        
        for (int i = s.length()-1;i>=0;i--) // reversing string
            rev+=s.charAt(i);

        return (s.equals(rev));
    }
    public static void main(String[] args) {
        ASG_6_Palindrome ps = new ASG_6_Palindrome();
        ps.input();        
    }    
}
