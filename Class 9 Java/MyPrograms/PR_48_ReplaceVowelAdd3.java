import java.util.*;
class PR_48_ReplaceVowelAdd3 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        str = sc.nextLine();
        for (int i = 0 ;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                switch(Character.toLowerCase(str.charAt(i))){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.print((char)(str.charAt(i)+2));
                        break;

                    default:
                        System.out.print((char)(str.charAt(i)-2));
                }
            }
            else
                System.out.print(str.charAt(i));
        }
    }
}
