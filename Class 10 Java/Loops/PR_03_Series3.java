class PR_03_Series3 {
    static void series1(int a,int n){
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum+=(int)Math.pow(a,i);
        }
        System.out.println("Sum of series 1 : "+sum);
    }

    static void series2(int a,int n){
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum+=(a+i);
        }
        System.out.println("Sum of series 2 : "+sum);

    }

    static void series3(int a){
        double sum = 0.0;
        for (int i = 3;i<=21;i+=3){
            sum+=(a/(i-1));
        }
        System.out.println("Sum of series 3 : "+sum);
    }

    static void series4(int a,int n){
        double sum = 0.0;
        for (int i = 1;i<=n;i++){
            sum+=(i/Math.pow(a,i));
        }
        System.out.println("Sum of series 4 : "+sum);
    }

    static void series5(int a,int n){
        int sum = 0;
        for (int i = 1,k=1;k<=n;i++,k+=2){
            if (i%2==1)
                sum+=(int)(Math.pow(a,k));
            else
                sum-=(int)(Math.pow(a,k));
            
        }
        System.out.println("Sum of series 5 : "+sum);
    }
    public static void main(String[] args) {
        int a = 5, n =10;
        series1(a, n);
        series2(a, n);
        series3(a);
        series4(a, n);
        series5(a, n);
    }    
}
