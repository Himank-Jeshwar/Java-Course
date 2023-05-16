public class SelectionSort {
    public static void main(String[] args) {
        int [] numbers = {25,37,52,42,57,18,3,19,24};
        for (int i = 0;i<numbers.length-1;i++){
            int smallest = i;
            for (int j = i+1;j<numbers.length;j++){
                if (numbers[j]<numbers[smallest]){
                    smallest = j;
                }
            }
        int var = numbers[smallest];
        numbers[smallest]=numbers[i];
        numbers[i]=var;
        }



        // to print the array
        System.out.print("{");
        for (int k = 0 ; k<numbers.length; k++){
            if (k<numbers.length-1)
                System.out.print(numbers[k]+", ");
            else 
                System.out.print(numbers[k]);
        }
        System.out.print("}");
    }
}
