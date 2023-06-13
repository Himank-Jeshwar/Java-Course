import java.util.*;
class PR_10_SortingArrays{
    public static void main(String[] args) {
        // int arr [] = new int [10];
        int arr [] = {56,42,12,34,5,78,6,3,71,30};
        int temp;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 numbers : ");
        
        // accepting elements
        // for (int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        
        System.out.println("Array before sorting : ");
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

// 1 4 5 3 6 2
//  
        for (int l = 0;l<4;l++){
            for (int k = 0;k<5-l-1;k++){
                if (arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }

        for (int l = 0;l<4;l++){
            for (int k = 5;k<(10-l-1);k++){
                if (arr[k]<arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }

        System.out.println("\nArray after sorting : ");
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

    }

    // thank you :)
}