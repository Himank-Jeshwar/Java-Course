import java.util.*;
class ASG_11_CountVowels {
    boolean isVowel(char ch){
        String vowels = "AEIOU"; // storing all vowels
        if (vowels.indexOf(ch)!=-1) // check for vowel
            return true;
        return false;
    }

    boolean isValid(String st){
        String punc = ".?!"; // storing all punctuators
        char lastCh = st.charAt(st.length()-1); 
        if (punc.indexOf(lastCh)!=-1) // check for punctuator
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s; // declaration       
        int freq = 0; // initializing frequency

        ASG_11_CountVowels ob = new ASG_11_CountVowels();
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter sentence : ");
        s = sc.nextLine().toUpperCase();
        
        if (ob.isValid(s)==true) // check for validity
        {
            for (char ch = 'A';ch<='Z';ch++){
                freq = 0;
                for (int i = 0;i<s.length();i++)
                    if (s.charAt(i)==ch)
                        freq++;
    
                // displaying the frequency of vowels
                if (ob.isVowel(ch)==true && freq!=0) 
                    System.out.println(ch+" occurs "+freq+" times");
            }
        }
        else 
            System.out.println("PUNCTUATION ERROR");        
    }
}
