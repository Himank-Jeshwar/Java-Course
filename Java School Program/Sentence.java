import java.util.Scanner;
class Sentence{
    String sentence;
    void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a sentence :- ");
       sentence = sc.nextLine().trim()+" ";    
       sc.close();
    // Windows_10_
    }

    int countWords(){
        int words = 0;
        
        String str = "";
        for (int j = 0;j<sentence.length();j++){
            boolean isWord = false;
            if (sentence.charAt(j)==' '){
                for (int i = 0;i<str.length();i++){
                    if ((str.charAt(i)>=65&&str.charAt(i)<=90)||(str.charAt(i)>=97&&str.charAt(i)<=122))
                        isWord = true;
                        
                }
                if (isWord){
                    words++;
                    str="";
                }
            }
                else 
                    str+=sentence.charAt(j);
                
        }
        return words;
    }
    int countLetters(){
        int letters = 0;
        for (int i = 0;i<sentence.length();i++){
            if ((sentence.charAt(i)>=65&&sentence.charAt(i)<=90)||(sentence.charAt(i)>=97&&sentence.charAt(i)<=122))
                letters++;
        }
        return letters;
    }
    public static void main(String[] args) {
        Sentence st = new Sentence();
        st.input();
        System.out.println("Number of words = "+st.countWords());
        System.out.println("Number of letters = "+st.countLetters());
    }
}