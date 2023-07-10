import java.util.*;
class Pattern2 {
    public static void main(String[] args) {
        String s;
        int len;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a word : ");
        s = sc.next();

        len = s.length();

        System.out.println(s);

        for (int i = 1;i<len-1;i++){
            System.out.print(s.charAt(i));
            for (int j = 0;j<len-2;j++)
                System.out.print(" ");
            System.out.println(s.charAt(len-i-1));
        }

        for (int k = len-1;k>=0;k--)
            System.out.print(s.charAt(k));
    }
}
