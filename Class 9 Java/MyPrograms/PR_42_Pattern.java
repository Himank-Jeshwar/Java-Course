import java.util.*;
class PR_42_Pattern {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice : ");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                for (int i = 1;i<=5;i++){
                    for (int j = 1;j<=i;j++)
                        System.out.print(i+" ");
                    System.out.println();
                }
                break;
            
            case 2:
                for (int i = 5;i>=1;i--){
                    for (int j = 1;j<=i;j++)
                        System.out.print(i+" ");
                    System.out.println();
                }
                break;
            
            default:
                System.out.print("INVALID CHOICE !");
        }
    }    
}
