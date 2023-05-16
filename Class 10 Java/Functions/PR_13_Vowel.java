import java.util.*;
class Vowel {
    
    static boolean isVowel(char ch){
        switch(Character.toLowerCase(ch)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // declaration
        String str;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        str = sc.nextLine();

        for (int i = 0;i<str.length();i++){
            if (isVowel(str.charAt(i)))
                c++;
        }

        System.out.println("Number of  vowels : "+c);
    }
}
