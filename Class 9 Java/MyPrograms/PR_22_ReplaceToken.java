import java.util.*;
class PR_22_ReplaceToken {
    public static void main(String[] args) {
        String str,newStr="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :-");

        do{
            str = sc.next();
            if (str.equals("RED"))
                newStr+="GREEN ";
            else
                newStr+=str+" ";

        }while(!(str.equals(".")));
            
            
        System.out.println(newStr);
    }
}
