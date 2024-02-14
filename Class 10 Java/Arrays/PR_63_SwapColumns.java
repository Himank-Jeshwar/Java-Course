class PR_63_SwapColumns {
    void show (int arr[][]){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int M[][] =  {{1,8,9,4,2,5},
                      {7,2,4,5,3,4},
                      {6,5,6,2,1,5},
                      {1,5,7,4,2,5},
                      {3,1,2,7,3,9},
                      {6,5,6,5,3,8}};

        PR_63_SwapColumns ob = new PR_63_SwapColumns();
        System.out.println("Original array : ");
        ob.show(M);
    
        int temp = 0,n = M.length; // declaration

    
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                // logic
            }
        }

        // output
        System.out.println("New array : ");
        ob.show(M);

    }
}
