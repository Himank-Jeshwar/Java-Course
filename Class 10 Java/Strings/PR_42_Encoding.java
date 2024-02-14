import java.util.*;
class PR_42_Encoding {
    public static void main(String[] args) {
        String s,newStr="";
        int len;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        s = sc.nextLine();

        for (int i = 0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i)))
                newStr+=(int)s.charAt(i);
            
            else 
                if (Character.isLowerCase(s.charAt(i)))
                    newStr+=Character.toUpperCase(s.charAt(i));
            
            else 
                if (s.charAt(i)==' ')
                    newStr+='$';
                else
                    if (Character.isDigit(s.charAt(i)))
                        newStr+='#';
                    else
                        newStr+='x'; 
        }

        System.out.println("New string : "+newStr);
    }
}
