import java.util.*;
class PR_20_PairingVowels {
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        switch (ch){
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
        String str,s;
        int c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        str = sc.nextLine();
        s = str;
        str = str.toUpperCase();

        for (int i = 0;i<str.length()-1;i++){
            if (isVowel(str.charAt(i))&&isVowel(str.charAt(i+1))){
                System.out.println(str.charAt(i)+""+str.charAt(i+1));
                c++;
                }
            } 

        System.out.println("\nOld string :"+s);
        System.out.println("New string : "+str);
        System.out.println("Number of paired vowels : "+c);
    }    
}
