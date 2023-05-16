import java.util.*;
class PR_12_ShortForm {
    public static void main(String[] args) {
        String s,word="";
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                word = s.substring(i-c, i);
                System.out.print(word.charAt(0));
                c = 0;
                word = "";
            }
            else
                c++;
        }
    }    
}
