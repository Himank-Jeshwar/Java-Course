import java.util.*;
class PR_40_Consecutive{
    public static void main(String args[]){
        String s;
        int f = 0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toLowerCase();

        System.out.println("Frequency of consective pairs : ");
        for (char ch = 'a';ch<'z';ch++){
            f = 0;
            for (int i = 0;i<s.length()-1;i++)
                if (ch==s.charAt(i)&&ch+1==s.charAt(i+1))
                    f++;
            if (f>0)
                System.out.println(ch+""+(char)(ch+1)+" - "+f);
        }
    }
}