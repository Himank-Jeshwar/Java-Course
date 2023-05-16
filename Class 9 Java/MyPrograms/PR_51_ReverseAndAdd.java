import java.util.*;
class PR_51_ReverseAndAdd{
    static String reverse (String str){
        String rev = "";
        for (int i = str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a word : ");
        s = sc.next();
        
        s+=reverse(s);
        System.out.println(s);
    }
}