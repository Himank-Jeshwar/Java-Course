import java.util.*;
class PR_16_Shifting {
    public static void main(String args[]){
        String s,newStr="";
        int n,diff = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toUpperCase();
        
        System.out.print("Enter a value : ");
        n = sc.nextInt();
        
        if (!(n>=1&&n<26)){
            System.out.print("N must be 1<=N<26");
            System.exit(0);
        }
        // e -- 5
        // n = 24
        // e ---> z
        // 24-21 = 3
        // z --> c

        for (int i = 0;i<s.length();i++){
           if (Character.isLetter(s.charAt(i))){
                diff = 26-(s.charAt(i)-64);
                if (n<=diff)
                    newStr+=(char)(s.charAt(i)+n);
                else
                    newStr+=(char)('A'+(n-1-diff));
            }
            else 
                newStr+=s.charAt(i);
        }
        
        System.out.println("New string : "+newStr);
    }
}