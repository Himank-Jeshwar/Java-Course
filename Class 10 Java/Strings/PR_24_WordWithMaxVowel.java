import java.util.*;
class PR_24_WordWithMaxVowel {
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }

    static int countVowels(String str){
        int c = 0;
        for (int i = 0;i<str.length();i++){
            if (isVowel(str.charAt(i)))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String s,maxVowel = "",word;
        int maxCount = 0,c=0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                word = s.substring(i-c, i);
                if (countVowels(word)>maxCount){
                    maxCount = countVowels(word);
                    maxVowel = word;
                }
                c=0;
            }
            else 
                c++;
        }

        System.out.println("Word with maximum vowels : "+maxVowel);
    }
}
