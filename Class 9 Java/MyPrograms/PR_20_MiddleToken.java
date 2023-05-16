import java.util.*;
class PR_20_MiddleToken {
    public static void main(String[] args) {
        //declaration
        String str,newStr = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        
        for (int i = 0;i<3;i++){
            str = sc.next();
            if (i==1)
                continue;
            newStr+=str+" ";
        }
        System.out.println(newStr);
    }
}
