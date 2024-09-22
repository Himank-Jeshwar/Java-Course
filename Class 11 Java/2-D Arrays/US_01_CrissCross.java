import java.util.*;
class US_01_CrissCross {
    public static void main(String[] args) {
        int n;
        String p1,p2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name : ");
        p1 = sc.nextLine();
        System.out.println("Enter player 2 name : ");
        p2 = sc.nextLine();

        System.out.println("Enter rows : ");
        n = sc.nextInt();

        if (PR_01_CrissCross.isValid(n)==true){
            PR_01_CrissCross ob = new PR_01_CrissCross(n,p1,p2);
            ob.input();
            ob.fillByUser();
            ob.fillByComp();
            ob.displayTable();
        }
    }
}
