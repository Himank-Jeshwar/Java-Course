class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {90,89,56,45,12};
        int s = 90;
        int start = 0,end = arr.length-1;

        while (start<=end){
            int middle = (start+end)/2;
            if (arr[middle]==s){
                System.out.println("Postion : "+middle);
                break;
            }
            else if (arr[middle]<s)
                end = middle - 1;
            
            else 
                start = middle + 1;
            }
        if (start > end)
            System.out.print("Not there !");
    }    
}
