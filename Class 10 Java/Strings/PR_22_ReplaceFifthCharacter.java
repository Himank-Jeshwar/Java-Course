import java.util.*;

class PR_22_ReplaceFifthCharacter {
    public static void main(String[] args) {
        String str;
        String ch = "";

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        str = sc.nextLine();

        for (int i = 0;i<str.length();i++){
            if (i==4)
                ch += str.charAt(i);
        }

        str = str.replaceAll(ch, "5");
        System.out.println(str);
    }    
}
