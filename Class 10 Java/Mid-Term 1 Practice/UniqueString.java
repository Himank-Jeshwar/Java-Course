import java.util.*;
class UniqueString {
    boolean isPresent(String s,char ch){
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==ch)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s,newStr = "";
        UniqueString ob = new UniqueString();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");
        s = sc.nextLine();

        for (int i = 0;i<s.length();i++){
            if (ob.isPresent(newStr,s.charAt(i))==false)
                newStr+=s.charAt(i);
        }
        
        if (s.equals(newStr))
            System.out.println("Unique String");
        else 
            System.out.println("Not a Unique String");

    }
}
