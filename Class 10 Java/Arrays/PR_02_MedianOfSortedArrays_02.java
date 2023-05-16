import java.util.*;
class MedianOfSortedArrays{
    public static void main(String[] args) {
        int nums1[],nums2[],merge[],m,n,mergedSize;
        double median;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        m = sc.nextInt();

        System.out.print("Enter n : ");
        n = sc.nextInt();

        nums1 = new int [m];
        nums2 = new int[n];

        System.out.println("ARRAY 1 :");
        for (int i = 0;i<m;i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("\nARRAY 2 :");
        for (int i = 0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        
        mergedSize = m+n;
        merge = new int [mergedSize];
        for (int i = 0;i<mergedSize;i++){
            if (i<m)
                merge[i] = nums1[i];
            else
                merge[i]= nums2[i-m];
        }       
        
        if (mergedSize%2==0)
            median = (merge[mergedSize/2-1]+ merge[mergedSize/2])/2.0;
        else 
            median = merge[((mergedSize+1)/2)-1];

        System.out.println("Median : "+median);



    }
}