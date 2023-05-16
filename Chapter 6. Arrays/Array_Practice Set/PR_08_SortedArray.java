public class PR_08_SortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,47,8,9};
        boolean isSorted = false;
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i]<arr[i+1]){
                isSorted = true;
            }
            else{
                isSorted = false;
                break;
            }
        }
        if (isSorted==true)
            System.out.println("Array is sorted.");
        else
            System.out.println("Array is not sorted.");
    }
}
