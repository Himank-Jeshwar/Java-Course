import java.util.*;
class PR_30_ReversingWordsInSentence {
    String reverse (String w){
        String rev = "";
        for (int i = w.length()-1;i>=0;i--) // reversing string
            rev+=w.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        // declaration
        String s,w="",newStr = "";
        PR_30_ReversingWordsInSentence ob = new PR_30_ReversingWordsInSentence();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                w = ob.reverse(w); // reversing the word
                newStr+=w+" ";
                w = "";
            }
            else 
                w+=s.charAt(i);
        }
        System.out.println("New sentence : "+newStr);
    }
}
