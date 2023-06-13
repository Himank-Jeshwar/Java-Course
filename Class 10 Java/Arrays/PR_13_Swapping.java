import java.util.*;
class PR_13_Swapping{
    public static void main(String[] args) {
        int temp;
        int arr[] = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 elements : ");
        
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // 90 16 35 40 22 11
        System.out.print("Old array : ");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
        for (int j = 0;j<arr.length-1;j+=2){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        } 

        System.out.print("\nNew array : ");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }        
    }
}