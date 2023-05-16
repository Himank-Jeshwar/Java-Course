import java.util.*;
class PR_53_Piglatin {
    public static void main(String[] args) {
        String word,newWord = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        word = sc.next();

        loop:
        for (int i = 0;i<word.length();i++){
           
                switch(Character.toLowerCase(word.charAt(i))){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        newWord += word.substring(i)+word.substring(0,i)+"AY";
                        break loop; 
                    }
        }
        System.out.println(newWord);
    }
}
