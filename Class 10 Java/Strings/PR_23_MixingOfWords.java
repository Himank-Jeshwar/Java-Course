import java.util.*;
class PR_23_MixingOfWords {
    public static void main(String[] args) {
        String str1,str2,newStr="";
        int len,i = 0,j = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string 1 : ");
        str1 = sc.next();
        System.out.print("Enter string 2 : ");
        str2 = sc.next();
        
        if (str1.length()!=str2.length()){
            System.out.println("Both strings must be of same length");
            System.exit(0);
        }
        len = str1.length()+str2.length();
        
        for (int k = 0;k<len;k++) {

            if (k%2==0){
                newStr+=str1.charAt(i);
                i++;
            }
            else {
                newStr+=str2.charAt(j);
                j++;
            }
        }       

        System.out.println(newStr);
    }    
}
