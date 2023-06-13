import java.util.*;

class PR_19_Joystring {
    void Joystring(String s,char ch1,char ch2){
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==ch1)
                System.out.print(ch2);
            else
                System.out.print(s.charAt(i));
        }
    }

    void Joystring(String s){
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                System.out.println("Index of first space - "+i);
                break;
            }
        }
        System.out.println("Index of last space - "+s.lastIndexOf(s));
    }

    void Joystring(String s1,String s2){
        String s3 = s1.concat(" "+s2);
        System.out.println(s3);
    }
    public static void main(String[] args) {
        String str1,str2;
        char old_ch,new_ch;
        int ch;

        PR_19_Joystring obj = new PR_19_Joystring();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        str1 = sc.nextLine();
        System.out.print("Enter choice : ");
        ch = sc.nextInt();
        sc.nextLine();
        switch(ch){
            case 1:
                System.out.print("Enter old character : ");
                old_ch = sc.next().charAt(0);
                System.out.print("Enter new character : ");
                new_ch = sc.next().charAt(0);
                obj.Joystring(str1,old_ch,new_ch);
                break;
            
            case 2:
                obj.Joystring(str1);
                break;
            
            case 3:
                System.out.print("Enter another string : ");
                str2 = sc.nextLine();
                obj.Joystring(str1, str2);
                break;
            
            default:
                System.out.println("Invalid Input.");
        }
    }
}
