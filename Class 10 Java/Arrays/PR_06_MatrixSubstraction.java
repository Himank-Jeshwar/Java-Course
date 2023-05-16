public class PR_06_MatrixSubstraction {
    public static void main(String[] args) {
        int m [][] = {{-1,0,2},
                      {-3,-1,6},
                      { 4,3,-1}};
        
        int o [][] = {{-6,9,4},
                      { 4,5,0},
                      {1,-2,-3}};

        int n[][] = new int [3][3];
        
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                n[i][j] = o[i][j]-m[i][j];
            }
        }

        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                System.out.print(n[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
