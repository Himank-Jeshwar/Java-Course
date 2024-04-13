import java.util.*;
class PR_08_SpecialArray {
    public static void main(String[] args) {
       int a[][] = new int[3][3];
       int odd = 0,even = 0;

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter elements : ");

        for (int i = 0;i<3;i++)
            for (int j = 0;j<3;j++)
                a[i][j] = sc.nextInt();

        for (int i = 0;i<3;i++)
            for (int j = 0;j<3;j++)
                if (a[i][j]%2==0)
                    even+=a[i][j];
                else
                    odd+=a[i][j];

        if (even==odd)
            System.out.println("Special Array");
        else
            System.out.println("Not a Special Array");
    }
}
