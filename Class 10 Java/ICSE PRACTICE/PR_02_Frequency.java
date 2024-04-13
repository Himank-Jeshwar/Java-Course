import java.util.*;
class PR_02_Frequency {
    public static void main(String[] args) {
        String s ;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toUpperCase();

        for (char ch = 'A';ch<='Z';ch++){
            c = 0;
            for (int i = 0;i<s.length();i++)
                if (ch==s.charAt(i))
                    c++;
            
            if (c>0)
                System.out.println("The character "+ch+" has occured for "+c+" time(s)");
        }
    }    
}
