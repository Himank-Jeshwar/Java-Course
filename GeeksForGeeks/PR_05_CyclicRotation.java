class PR_05_CyclicRotation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 3;  // number of rotation
        int last,temp = 0;
        
        for (int i = 0;i<k;i++){
            last = arr[arr.length-1]; // storing last element
            for (int j = arr.length-1;j>0;j--)
                arr[j] = arr[j-1]; 
            
            // // swapping
            arr[0] = last;
            
        }
        
        for (int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        
    }    
}
