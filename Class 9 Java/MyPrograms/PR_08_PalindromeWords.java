import java.util.*;
public class PR_08_PalindromeWords {
    public static String reverse(String word){
        String copy = "";
        for (int i = word.length()-1;i>=0;i--){
            copy+=word.charAt(i);
        }
        return copy;
    }
    public static void main(String[] args) {
        // declaration
        String wordArr[]=new String [4],revWord;

        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 words :- ");
        for (int i = 0;i<wordArr.length;i++){
            wordArr[i]=sc.next();
        }

        // displaying palindrome words
        System.out.println("\nPalindrome words are :-");
        for (int j = 0;j<wordArr.length;j++){
            revWord = reverse(wordArr[j]);
            if (revWord.equalsIgnoreCase(wordArr[j]))
                System.out.println(wordArr[j]);
        }
    }
}
