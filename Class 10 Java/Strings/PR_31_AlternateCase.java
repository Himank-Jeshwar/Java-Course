import java.util.*;
class AlternateCase{
    public static void main(String[] args) {
        String s,newStr = "";
        int k = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine();
        newStr+=Character.toUpperCase(s.charAt(0));
        
        for (int i = 1;i<s.length();i++){
            if (Character.isLetter(s.charAt(i))){
                if (k%2==0)
                    newStr+=Character.toLowerCase(s.charAt(i));
                else
                    newStr+=Character.toUpperCase(s.charAt(i));
                k++;
            }
            else
                newStr+=s.charAt(i);

        }

        System.out.println("Input : "+s);
        System.out.println("Output : "+newStr);
    }
}