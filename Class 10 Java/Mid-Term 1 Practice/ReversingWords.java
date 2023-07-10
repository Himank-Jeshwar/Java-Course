import java.util.*;
class ReversingWords {
    public static void main(String[] args) {
        String s,revStr = "";
        String w = "";

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");
        s = sc.nextLine().trim();
        s = " "+s;
        for (int i = s.length()-1;i>=0;i--){
            
            if (s.charAt(i)==' '){
                for (int j = w.length()-1;j>=0;j--)
                    revStr+=w.charAt(j);
                revStr+=" "; // add space at the end
                w = "";
            }
            else 
                w+=s.charAt(i);
        }

        System.out.println("Old sentence : "+s);
        System.out.println("New sentence : "+revStr);
    }
}
