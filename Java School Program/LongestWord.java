import java.util.Scanner;
class LongestWord {
    String sentence;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        sentence = sc.nextLine().trim()+" ";
        sc.close();
    }
    void getLongestWord(){
        int maxLength = 0,count = 0,n = 0;
        String longestWord = "";
        // TATA FOOTBALL ACADEMY
        // maxLength = 8
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                if(count>maxLength){
                    maxLength = count;

                    // incomplete logic 
                }
                count=0;
            }
            else 
               count++;
            n++;
        }
    System.out.println("Longest Word = "+longestWord);
    System.out.println("Length of the word = "+maxLength);    
    }   
    public static void main(String[] args) {
        LongestWord word = new LongestWord();
        word.input();
        word.getLongestWord();
    }
}
