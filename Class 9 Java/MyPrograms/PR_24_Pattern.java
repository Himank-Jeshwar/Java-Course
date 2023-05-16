import java.util.*;
class PR_24_Pattern{
    void pattern(){
        String s = "CLASS";
        for (int i = s.length()-1;i>=0;i--){
            for (int j = 0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }

    void pattern1(){
        String s = "WHERE";
        for (int i = 0;i<s.length();i++){
            for (int k = 0;k<i;k++)
                System.out.print(" ");

            for (int j = i;j<s.length();j++)
                System.out.print(s.charAt(j));
            System.out.println();
        }
    }
        public static void main(String[] args) {
            int ch;
            PR_24_Pattern obj = new PR_24_Pattern();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice : ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    obj.pattern();
                    break;
                case 2:
                    obj.pattern1();
                    break;
                default:
                    System.out.println("INVALID CHOICE !");
            }
        }

}