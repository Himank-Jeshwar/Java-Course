import java.util.*;
class PR_47_SortIntegers {
    void show(int a[]){
        for (int i = 0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int n,arr[],temp,min = 0;
        PR_47_SortIntegers ob = new PR_47_SortIntegers();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array : ");
        n = sc.nextInt();

        arr = new int [n]; // allocating space

        System.out.println("Enter "+n+" numbers:");
        for (int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.print("Original array :");
        ob.show(arr);

        // sorting
        for (int i = 0;i<n-1;i++){
            min = i;
            for (int j = i+1;j<n;j++)
                if (arr[j]%10<arr[min]%10)
                    min = j;
            
            // swapping
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // output
        System.out.print("Sorted array : ");
        ob.show(arr); 
    }
}
