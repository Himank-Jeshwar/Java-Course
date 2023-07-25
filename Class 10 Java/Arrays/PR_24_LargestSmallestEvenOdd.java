class PR_24_LargestSmallestEvenOdd {
    public static void main(String[] args) {
        int arr[] = {34,23,11,2,12,40,31,24,15,20};
        int even[] = new int [arr.length];
        int odd[] = new int [arr.length];
        int e = -1,o = -1;
        int largest,smallest;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]%2==0)
                even[++e] = arr[i];
            else 
                odd[++o] = arr[i];
        }
        largest = even[0];
        smallest = odd[0];
        
        for (int j = 0;j<=e;j++){
            if (even[j]>largest)
                largest = even[j];
        }

        for (int j = 0;j<=o;j++){
            if (odd[j]<smallest)
                smallest = odd[j];
        }

        System.out.println("Largest even number : "+largest);
        System.out.println("Smallest odd number : "+smallest);
    }    
}
