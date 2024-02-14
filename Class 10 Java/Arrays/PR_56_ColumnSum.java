import java.util.*;
class PR_56_ColumnSum{
    public static void main(String[] args) {
        int arr[][] = new int [3][3];
        int colSum = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements : ");
        for (int i = 0;i<3;i++)
            for (int j = 0;j<3;j++)
                arr[i][j] = sc.nextInt();

        
        System.out.println("Column\tSum of Column Entries");
        for (int j = 0;j<3;j++){
            colSum = 0;
            for (int i = 0;i<3;i++)
                colSum+=arr[i][j];
            
            System.out.println((j+1)+"\t"+colSum);
        }
    }
}