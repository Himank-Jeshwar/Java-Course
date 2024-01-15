// GARAM MASALA PROGRAM - 1
import java.util.*;
class PR_17_Sorting {
    void show(int arr[][]){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
        System.out.println();
    }
    }
    
    public static void main(String args[]){
        int m , n,min,t,max;
        int arr[][];
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter m = ");
        m = sc.nextInt();
        System.out.print("Enter n = ");
        n = sc.nextInt();
        
        PR_17_Sorting ob = new PR_17_Sorting ();
        arr = new int [m][n];
        System.out.println("Enter elements : ");
        for (int i = 0;i<m;i++)
            for (int j = 0;j<n;j++)
                arr[i][j] = sc.nextInt();
                
        System.out.println("Original matrix : ");
        ob.show(arr);
        // sorting row wise    
        for (int i = 0;i<m;i++){
            
            for (int j = 0;j<n-1;j++){
                min = j;
                max = j;
                for (int k = i+1;k<n;k++){
                    if (arr[i][k]<min)
                        min = k;
                        
                    if (arr[i][k]>max)
                        max = k;
                }
                
                // swapping
                if (i%2==0){
                    t = arr[i][min];
                    arr[i][min]=arr[i][j];
                    arr[i][j] = t;
                }
                else{
                    t = arr[i][max];
                    arr[i][max]=arr[i][j];
                    arr[i][j] = t;
                }
                
            }
                
        }
        
        // printing
        System.out.println("Sorted matrix : ");
        ob.show(arr);
    }
}