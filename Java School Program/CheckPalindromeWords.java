import java.util.Scanner;
class CheckPalindromeWords {
    private String sentence;
    private String reverse(String str){
        String revString = "";
        for (int i = str.length()-1;i>=0;i--){
            revString+=str.charAt(i);
        }
        return revString;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine().trim()+" ";
        sc.close();
    }

    void display(){
        int len = 0;
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                String str = sentence.substring(i-len,i);
                if (str.equals(reverse(str)))
                    System.out.println(str);
                len = 0;
            }

            else
                len++;
        }
    }
    public static void main(String[] args) {
        CheckPalindromeWords palindromeWords = new CheckPalindromeWords();
        palindromeWords.input();
        palindromeWords.display();
    }
}
