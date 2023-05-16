import java.util.*;
class PR_21_Compare {
    public static void main(String[] args) {
        String str1,str2;
        
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();

        if(str1.charAt(0)<str2.charAt(0))
            System.out.print(str1+","+str2);
        else
            System.out.println(str2+","+str1);
    }
}
