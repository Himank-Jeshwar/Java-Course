public class SelectionSort {
    public static void main(String[] args) {
        int [] num = {450,33,120,89,24,190,4,2};
        for (int i = 0;i<num.length-1;i++){
            int smallest = i;
            for (int j = i+1;j<num.length;j++){
                if (num[j]<num[smallest]){
                    smallest = j;
                }
            }
            int temp = num[smallest];
            num[smallest]=num[i];
            num[i]=temp;

        }
        // code to print the array
            System.out.print("{");
        for (int i = 0; i<num.length; i++){
            if (i<num.length-1){
                System.out.print(num[i]+", ");
            }
            else {
                System.out.print(num[i]);
            }
        }
        System.out.print("}");
    }
}
