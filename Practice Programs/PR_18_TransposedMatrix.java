public class PR_18_TransposedMatrix{
    
    public static void main(String[] args) {
        int [][] originalMat = {{2,9,3},
                                {4,5,8},
                                {7,6,1}};
        
        int [][] transposedMat = {{0,0,0},
                                  {0,0,0},
                                  {0,0,0}};
        
        // transposing the  matrix
        for (int i = 0;i<originalMat.length;i++){
            for (int j = 0;j<originalMat[i].length;j++){
                transposedMat[i][j]=originalMat[j][i];
            }
        }

        // printing the transposed matrix
        for(int [] arr:transposedMat){
            for (int el : arr){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
