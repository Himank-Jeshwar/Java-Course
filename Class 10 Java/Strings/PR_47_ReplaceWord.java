import java.util.*;
class PR_47_ReplaceWord {
    public static void main(String[] args) {
        String s,w1,w2,w="",newStr="";
        boolean isPresent = false;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence : ");
        s = sc.nextLine().trim()+" ";

        System.out.print("Enter word 1 : ");
        w1 = sc.next();
        System.out.print("Enter word 2 :");
        w2 = sc.next();


        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                if(w.equals(w1)){
                    isPresent = true;
                    newStr+=w2+" ";
                }
                else
                    newStr+=w+" ";
                w = "";
            }
            else
                w+=s.charAt(i);
        }

        System.out.println("Original sentence : "+s);
        if (isPresent)
            System.out.println("New sentence : "+newStr);
        else
            System.out.println("Cannot replace since the word does not exist !");
    }
}
