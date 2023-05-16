import java.util.*;
class PR_01_BinarySearch{
    public static void main(String[] args) {
        // declaration
        int arr[] = {2,5,7,10,15,20,29,30,46,50};
        int search,start = 0,end = arr.length-1,middle;

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search : ");
        search = sc.nextInt();

        // binary search
        while (start<=end){
            middle = (start+end)/2;
            if (search==arr[middle]){
                System.out.print(search+" is found in index "+middle);
                break;
            }
            else if (search<arr[middle])
                end--;
            else 
                start++;
        }

        if (start>end)
            System.out.print("Search element not found.");
    }
}