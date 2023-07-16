import java.util.*;
class ASG_11_CountVowels {
    boolean isVowel(char ch){
        switch(ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }

    boolean isValid(String st){
        switch(st.charAt(st.length()-1)){
            case '.':
            case '!':
            case '?':
                return true;
        }
        System.out.print("PUNCTUATION ERROR");
        System.exit(0);
        return false;
    }

    public static void main(String[] args) {
        String s; // declaration       
        int freq = 0;

        ASG_11_CountVowels ob = new ASG_11_CountVowels();
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter sentence : ");
        s = sc.nextLine().toUpperCase();
        ob.isValid(s);

        for (char ch = 'A';ch<='Z';ch++){
            freq = 0;
            for (int i = 0;i<s.length();i++)
                if (s.charAt(i)==ch)
                    freq++;
    
            if (ob.isVowel(ch))
                System.out.println(ch+" occurs "+freq+" times");
        }        
    }
}
