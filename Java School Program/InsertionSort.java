/**
 @author Himank Jeshwar
 @version 0.1
 @since 2022
 */
public class InsertionSort {
    //Used to sort the array using insertion sort 
    public static void main(String[] args) {
        int [] arr = {45,12,33,9,1,2};
        for (int i = 0;i<arr.length;i++){
            for (int j = i;j>0&&arr[j]<arr[j-1];j--){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            // Method 2
            // while(j>0&&arr[j]<arr[j-1]){
            //     int temp = arr[j];
            //     arr[j]=arr[j-1];
            //     arr[j-1]=temp;
            //     j-=1;
            // }
        }        
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }
}
