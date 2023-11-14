import java.util.*;
class PR_33_ASCII_Manipulation {
    public static void main(String[] args) {
        String s,newStr="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine().toLowerCase();

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)!=' ')
                if (s.charAt(i)>=97&&s.charAt(i)<=116)
                    newStr+=(char)(s.charAt(i)+6);
                else 
                    newStr+=(char)(s.charAt(i)-20);
            else
                newStr+=" ";
        }
        System.out.println("Output : "+newStr);
    } // 26 - n = 20   [n = 6]
    
}
