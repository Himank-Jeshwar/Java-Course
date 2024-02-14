import java.util.*;
class PR_26_Intersection {
    public static void main(String[] args) {
        String set = "",s1,s2;
        char ch ;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two words : ");
        s1 = sc.next().toUpperCase();
        s2 = sc.next().toUpperCase();

        for (int i = 0;i<s1.length();i++){
            ch = s1.charAt(i);    
            for (int j = 0;j<s2.length();j++)
                if (ch==s2.charAt(j)&&set.indexOf(ch)==-1)
                    set+=ch;
        }

        System.out.print("Intersecting set : "+set);
    }
}
