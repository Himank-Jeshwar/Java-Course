import java.util.*;
class PR_44_Sentence {
    public static void main(String[] args) {
        String s="",newStr = "";
        Scanner sc = new Scanner(System.in);

        while(true){
            s = sc.next();
            if (s.equals("26"))
                newStr+="15 ";
            else if(s.equals("January"))
                newStr+="August ";
            else if (s.equals("Republic"))
                newStr+="Independence ";
            else if (s.equals("."))
                break;
            else
                newStr+=s+" ";
        }
        System.out.println("New string : - \n"+newStr);
    }    
}
