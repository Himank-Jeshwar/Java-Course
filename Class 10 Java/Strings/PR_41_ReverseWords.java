import java.util.*;
class PR_41_ReverseWords{
    public static void main(String[] args) {
        String s,newStr="",w="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                w = Character.toUpperCase(w.charAt(w.length()-1))+w.substring(1,w.length()-1)+Character.toUpperCase(w.charAt(0));
                newStr+=w+" ";
                w = "";
            }
            else    
                w+=s.charAt(i);
        }

        // output
        System.out.println("New String : "+newStr);
    }
}