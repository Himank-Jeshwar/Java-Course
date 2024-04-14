class PR_02_Reverse {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2};
        int temp =  0,n = arr.length;
        for (int i = 0;i<n/2;i++){
            // swapping
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }    
}
