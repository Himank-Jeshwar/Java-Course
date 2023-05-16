// I'll think about it tommorrow !
import java.util.Scanner;
class PalindromeWords {
    String sentence,palindrome[];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine().trim()+" ";
        sc.close();
    }

    void display(){
        String word = "";
        int length = 0 , n = 0;
        palindrome = new String[sentence.length()];
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                for (int j = i-1;j>(n-length);j--)
                    word+=sentence.charAt(j);
                length = 0;
            }

            else{
                length++;
            }
            if (word.equals(sentence.substring(n-length,i)))
                palindrome[i]=word;
            n++;
        }
        for (String str : palindrome) {
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        PalindromeWords words = new PalindromeWords();
        words.input();
        words.display();
    }
}
