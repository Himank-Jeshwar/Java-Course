import java.util.*;
class PR_03_Insertion {
    void show(int arr[],int n){
        for (int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[],n,el,ind,temp = 0;
        PR_03_Insertion ob = new PR_03_Insertion();

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of the array : ");
        n = sc.nextInt();

        arr = new int[n+1];

        System.out.println("Enter elements : ");
        for (int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter an element to insert : ");
        el = sc.nextInt();

        System.out.print("Enter the index number where to insert : ");
        ind = sc.nextInt();
        
        System.out.println("Array before insertion : ");
        ob.show(arr, n);

        // shifting elements towards right
        for (int i = n;i>ind;i--)
            arr[i]=arr[i-1];
        
        arr[ind] = el;

        System.out.println("Array after insertion : ");
        ob.show(arr, n+1);
    }
}
