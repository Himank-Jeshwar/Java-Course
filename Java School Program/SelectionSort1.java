// {5,7,2,9,1}
public class SelectionSort1 {
    public static void main(String[] args) {
        int [] arr = {5,7,2,9,1};
        for (int i = 0;i<arr.length;i++){
            int index = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[index])
                    index = j;
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }
}
