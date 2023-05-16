class SortedArray {
    public static void main(String[] args) {
        int [] num = {17,81,30,1,2,9,4,3};
        for (int i = 0;i<num.length;i++){
            for (int j = 0;j<num.length-i-1;j++){
                if (num[j]>num[j+1]){
                    int val = num[j];               
                    num[j]=num[j+1];    
                    num[j+1]=val;                    
                }
            }
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