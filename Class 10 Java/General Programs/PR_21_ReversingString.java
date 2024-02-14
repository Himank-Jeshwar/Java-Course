import java.util.*;
class PR_21_ReversingString{
    public static void main(String[] args) {
        String s,rev="";
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.next();

        for (int i = 0;i<s.length();i++)
            rev = s.charAt(i)+rev;

        System.out.println(rev);
    }
}