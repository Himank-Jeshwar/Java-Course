import java.util.*;
class PR_50_VowelFinder {
    public static void main(String[] args) {
        String word; int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        word = sc.next();

        for (int i = 0;i<word.length();i++){
            switch(Character.toLowerCase(word.charAt(i))){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    c++;
                    System.out.println(word.charAt(i)+" - "+i+","+word.lastIndexOf(word.charAt(i)));
                    word = word.replace(word.charAt(i),'\0');
                    break;
                
            }
        }

        if (c==0)
            System.out.println("Sorry no vowel");
    }
}
