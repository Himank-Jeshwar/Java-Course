import java.util.Scanner;

class PR_09_Pattern2 {
    static String revString(String str){
        String st="";
        for (int i = str.length()-1;i>=0;i--){
            st+=str.charAt(i);
        }
        return st;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        s = sc.next();
        char [] ch = s.toCharArray();
        for (int i = 0;i<ch.length;i++){
            if (i==0)
                System.out.println(s);
            else if (i==ch.length-1){
                s = revString(s);
                System.out.println(s);
            } 
            else{
                System.out.print(ch[i]);
                for (int j = 0;j<ch.length-2;j++)
                    System.out.print(" ");
                System.out.println(ch[ch.length-i-1]);
            }
        }
    }
}
