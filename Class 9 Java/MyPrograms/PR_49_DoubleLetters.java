import java.util.*;
class PR_49_DoubleLetters{
    static boolean isDoubleLetterWord(String word){
        for (int i = 0;i<word.length()-1;i++){
            if (word.charAt(i)==word.charAt(i+1))
                return true;
        }
        return false;
    } 

    public static void main(String[] args) {
        String sentence ,word;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence :-");        
        sentence = sc.nextLine().trim()+" ";
        // Apple can      Apple  c = 1  i = 5
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                word = sentence.substring(i-c, i);
                if (isDoubleLetterWord(word)==true)
                    System.out.println(word);
                c=0;
            }
            else 
                c++;
        }
    }
}