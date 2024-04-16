import java.util.Scanner;

class PR_10_LongSum {
    public static void main(String[] args) {
        String str1,str2,str3 = "",finalAns = "";
        int n1,n2,carry = 0;
        int len1,len2;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1 :");
        str1 = sc.next();

        System.out.print("Enter number 2 : ");
        str2 = sc.next();
        
        len1 = str1.length();
        len2 = str2.length();

        // equalizing the length of both strings
        if(str1.length()<str2.length()){
            for (int i = 0;i<len2-len1;i++)
                str1 = "0"+str1;
        }
    
        if (str2.length()<str1.length()){
            for (int i = 0;i<len1-len2;i++)
                str2 = "0"+str2;
        }

        // addition
        for (int i = len1-1;i>=0;i--){
            n1 = str1.charAt(i)-48; // converting to integers
            n2 = str2.charAt(i)-48;

            str3+=(n1+n2)%10+carry;
            carry = (n1+n2)/10;
        }

        // reversing the string
        for(int i = 0;i<len1;i++)
            finalAns = str3.charAt(i)+finalAns;

        System.out.println("Final answer : "+finalAns);
    }    
}
