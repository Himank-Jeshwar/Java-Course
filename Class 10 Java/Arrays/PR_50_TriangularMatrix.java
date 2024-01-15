import java.util.*;
class PR_50_TriangularMatrix {
    public static void main(String[] args) {
        // int matrix[][],n;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter dimension of the array : ");
        // n = sc.nextInt();

        // matrix = new int[n][n];

        int n = 6;
        int matrix [][] = {{2,3,1,5,9,3},
                           {7,9,2,9,8,1},
                           {3,6,1,5,3,1},
                           {3,4,5,1,7,6},
                           {5,3,2,1,0,3},
                           {4,6,7,2,1,9}};
        // for (int i = 0;i<n;i++)
        //     for(int j = 0;j<n;j++)
        //         matrix[i][j] = sc.nextInt();

        // printing triangular matrix
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (i<j) // upper triangle 
                    System.out.print(matrix[i][j]+" ");
                else 
                    System.out.print("  ");
            }
            // (alternative way)
            // for (int k = i;k<n;k++)
            //     if (i!=k)
            //         System.out.print(matrix[i][k]+" ");
            
            System.out.println();
        }
        
        // 1 2 3 4
        // 5 6 7 8 
        // 9 8 2 1
        // 1 3 4 5
    }    
}
