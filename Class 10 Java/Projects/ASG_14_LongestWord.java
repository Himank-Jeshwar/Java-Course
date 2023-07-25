import java.util.*;
class ASG_14_LongestWord {
    public static void main(String[] args) {
        String s,longest = "",w="";
        int max = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                if (w.length()==max)
                    longest+=","+w;
                else if (w.length()>max){
                    max = w.length();
                    longest = w;
                }
                w = "";
            }
            else 
                w+=s.charAt(i);
        }
        System.out.println("Longest word(s) : "+longest);
    }
}
