import java.util.*;
class PR_12_AlphabeticalString {
    public static void main(String[] args) {
        // declaration
        String word,newWord = "";
        char temp;

        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        word = sc.next().toUpperCase();
// Computer -> C
        for (int i = 65;i<91;i++){
            for (int j = 0;j<word.length();j++)
                temp = word.charAt(j);
                if (temp==(char)i||temp==(char)(i+32))
                    newWord+=temp;
        }
        System.out.println(newWord);
    }
}
