class PR_40_Series {
    public static void main(String[] args) {
        int s = 0,factorial = 1;
        for (int i = 1;i<=10;i++){
            for (int j = 1;j<=i;j++)
                factorial*=j;
            s+=factorial;
        }
        System.out.print("Sum = "+s);
    }    
}
