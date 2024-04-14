class PR_06_WaveArray {
    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int min = 0,temp = 0;

        // selection sort
        for (int i = 0;i<arr.length-1;i++){
            min = i;
            for (int j = i+1;j<arr.length;j++)
                if(arr[j]<arr[min]) 
                    min = j;
            
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        temp = 0;

        for (int i = 0;i<arr.length-1;i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        System.out.print("Wave array : ");
        for (int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
}