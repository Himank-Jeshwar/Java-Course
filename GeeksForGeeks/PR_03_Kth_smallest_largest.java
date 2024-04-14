import java.util.*;
class PR_03_Kth_smallest_largest {
    public static void main(String[] args) {
        int k,arr[] = {7, 10, 4, 3, 20, 15};
        int temp = 0,min = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of k : ");
        k = sc.nextInt();

        // selection sort
        for (int i = 0;i<arr.length-1;i++){
            min = i;
            for (int j = i+1;j<arr.length;j++)
                if (arr[j]<arr[min])
                    min = j;
            
            // swapping
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Kth smallest element is : "+arr[k-1]);
    }    
}
