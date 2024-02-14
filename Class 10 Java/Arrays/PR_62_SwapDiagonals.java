class PR_62_SwapDiagonals {
    void show (int arr[][]){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int M[][] =  {{1,8,9},
                      {7,2,4},
                      {6,5,3}};
        PR_62_SwapDiagonals ob = new PR_62_SwapDiagonals();
        System.out.println("Original array : ");
        ob.show(M);

        int temp = 0,n = M.length;

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (i+j==n-1){// swapping
                    temp = M[i][i]; 
                    M[i][i] = M[i][j];
                    M[i][j] = temp;
                }
            }
        }

        // output
        System.out.println("New array : ");
        ob.show(M);
    }
}
