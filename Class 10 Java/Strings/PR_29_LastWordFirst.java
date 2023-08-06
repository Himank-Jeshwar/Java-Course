import java.util.*;
class PR_29_SurnameFirst {
    public static void main(String[] args) {
        String s,newStr = "";
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim();

        index = s.lastIndexOf(' ');
        newStr=s.substring(index+1,s.length())+" "+s.substring(0,index);

        System.out.println("New sentence : "+newStr);
    }
}
