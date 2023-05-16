public class PR_04_AddingMatrices {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,5},
                         {4,5,9} };
        
        int [][] mat2 = {{7,8,2},
                         {8,4,1} };
        
        int [][] result = {{0,0,0},
                           {0,0,0}};
        
        for (int i = 0;i<mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
         
        }

        for (int i = 0;i<mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
            System.out.println();
        }
    }
}
