class PR_01_PeakElement{
    public static void main(String []args){
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        String peak = "";
        int flag = 1; 
        // 0 - does not keep inreasing 
        // 1 - keeps increasing
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1])
                flag = 0;

            if (i!=0)
                if (arr[i-1]<arr[i] && arr[i+1]<arr[i]) // peak element
                    peak+=arr[i]+"\n";

            if (i==0 && arr[i+1]<arr[i])
                peak+=arr[i]+"\n";
            
            if (i==arr.length-2 && arr[i]<arr[i+1])
                peak+=arr[i+1]+"\n";
        }

        if (flag == 1)
            peak += arr[arr.length-1];
        
        System.out.println("Peak elements are : \n"+peak);
    }
}