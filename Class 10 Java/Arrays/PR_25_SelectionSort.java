class PR_25_SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,2,12,45,10,1,34};
        int min = 0,temp;
        int search = 11;
        int mid,start = 0,end = arr.length-1;
        for (int i = 0;i<arr.length;i++){
            min = i;
            for (int j = i+1;j<arr.length-1;j++){
                if (arr[j]<arr[min])
                    min = j;
            }
            
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
        while(start<=end){
            mid = (start+end)/2;
            if (arr[mid]==search){
                System.out.println("\nFound at position : "+(mid+1));
                break;
            }
            else if (search<arr[mid])
                end = mid-1;
            else 
                start = mid+1;
        }
        System.out.println((start>end)?"\nNot found":"");
    }    
}
