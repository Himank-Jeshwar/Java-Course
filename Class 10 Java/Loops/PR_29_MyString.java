import java.util.*;
class PR_29_MyString {
    public static void main(String[] args) {
        String s,newStr = "";

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter word : ");
        s = sc.next();

        if (s.charAt(0)=='E')
            newStr = s.substring(0,s.length()-2)+'O';

        System.out.println("New string : "+newStr);
    }
}
