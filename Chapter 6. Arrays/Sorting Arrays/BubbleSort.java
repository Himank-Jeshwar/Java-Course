public class BubbleSort {
    public static void main(String[] args) {
        int [] numbers = {67,150,8,12,6,340,4,2,9};
        for (int i = 0 ; i<numbers.length-1;i++){
            for (int j = 0 ; j<numbers.length-i-1; j++){
                if (numbers[j]>numbers[j+1]){
                    int var = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=var;
                }
            }
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