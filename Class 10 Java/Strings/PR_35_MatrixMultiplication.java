import java.util.*;
class PR_35_MatrixMultiplication {
    void show(int arr[][]){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PR_35_MatrixMultiplication ob = new PR_35_MatrixMultiplication();
        int A[][] = {{5},
                     {4}};
        
        int B[][] = {{4,5}};

        int ans[][] = {{0,0},
                       {0,0}};
        
        // multiplication
        for (int i = 0;i<ans.length;i++){
            for (int j = 0;j<ans[i].length;j++){
                for (int k = 0;k<A[i].length;k++) // each row addition
                    ans[i][j]+=A[i][k]*B[k][j];
            }
        }

        ob.show(ans);
    }
}
