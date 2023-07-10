import java.util.*;
class ExtractingWords {
    public static void main(String[] args) {
        String s,w="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                System.out.println(w);
                w = "";
            }
            else 
                w+=s.charAt(i);
        }
    }
}
