class PR_41_Fibonacci {
    public static void main(String[] args) {
        int fibArr[] = new int[30];
        int s = 0;
        fibArr[0]=5;
        fibArr[1]=8;
        s = fibArr[0]+fibArr[1]; 
        for (int i = 2;i<30;i++){
            fibArr[i] = fibArr[i-1]+fibArr[i-2];
            s+=fibArr[i];
        }

        System.out.print("Fibonacci Series : ");
        for (int i = 0;i<30;i++)
            System.out.print(fibArr[i]+" ");
        System.out.println();

        System.out.println("Sum of the series : "+s);
    }    
}
