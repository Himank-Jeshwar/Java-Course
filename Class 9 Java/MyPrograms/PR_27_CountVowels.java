import java.util.*;
class PR_27_CountVowels {
    public static void main(String[] args) {
        // declaration
        String word;
        int c = 0,vowels = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        word = sc.next();

        for (int i = word.length()-1;i>=0;i--,c++){
            switch(word.charAt(i)){
                case 'a':case 'e':case 'i':case 'o':case 'u':
                case 'A':case 'E':case 'I':case 'O':case 'U':
                vowels++;
            }
            System.out.print(word.charAt(i));
        }
        System.out.println("\nNumber of characters : "+c);
        System.out.print("Number of vowels : "+vowels);
    }
}
