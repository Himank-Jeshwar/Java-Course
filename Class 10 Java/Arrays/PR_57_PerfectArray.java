import java.util.*;
class PR_57_PerfectArray{
    public static void main(String args[]){
        double arr[][] = new double [4][4];
        double sum = 0.0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements : ");

        for (int i = 0;i<4;i++)
            for (int j = 0;j<4;j++)
                arr[i][j] = sc.nextDouble();

        for (int i = 0;i<4;i++)
            for (int j = 0;j<4;j++)
                sum+=arr[i][j];

        System.out.println("MATRIX : ");
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }

        if ((int)sum%2==0)
            System.out.println("Perfect array");
        else
            System.out.println("NOT a Perfect array");
    }
}