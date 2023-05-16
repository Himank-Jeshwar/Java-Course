/**
 * InsertionSort
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,3,90,22,10,5,28};
        for (int i = 1;i<arr.length;i++){
            int currentel = arr[i];
            int j = i-1;
            while (j>=0 && currentel<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
        arr[j+1] = currentel;
        }
         // to print the array
         System.out.print("{");
         for (int k = 0 ; k<arr.length; k++){
             if (k<arr.length-1)
                 System.out.print(arr[k]+", ");
             else 
                 System.out.print(arr[k]);
         }
         System.out.print("}");
    }
}