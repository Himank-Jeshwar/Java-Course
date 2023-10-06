import java.util.*;
class ASG_12_EndswithING{
    public static void main(String[] args) {
        String s,w = "";
        int n = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().toLowerCase().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)>=48&&s.charAt(i)<=57){
                System.out.println("ERROR - Digits NOT ALLOWED");
                System.exit(0);
            }
            else if (s.charAt(i)==' '){
                if (w.endsWith("ing"))
                    n++;
            }
            else 
                w+=s.charAt(i);
        }
        System.out.println("Frequency of words that end with ing = "+n);
    }
    
}
