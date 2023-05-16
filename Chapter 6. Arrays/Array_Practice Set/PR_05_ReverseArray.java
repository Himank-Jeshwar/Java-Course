public class PR_05_ReverseArray {
    public static void main(String[] args) {
        int [] arr = {7,9,12,11};
        for (int i = 0;i<Math.floorDiv(arr.length,2);i++){
            int var = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=var;
        }
        for (int el:arr){
            System.out.print(el+" ");
        }
        }
    }
