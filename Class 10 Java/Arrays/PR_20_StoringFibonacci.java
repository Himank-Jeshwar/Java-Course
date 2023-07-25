class PR_20_StoringFibonacci{
    boolean isPrime(int n){
        for (int i = 2;i<n;i++){
            if (n%i==0&&n!=2)
                return false;
        }
        if (n!=1&&n!=0)
            return true;
        return false;
    }
    
    void show(int ar[]){
        for (int i = 0;i<ar.length;i++){
            if (isPrime(ar[i]))
                System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        int fib[] = new int[30];
        int a = 0,b = 1,c = 0;
        PR_20_StoringFibonacci ob = new PR_20_StoringFibonacci();

        // storing fibonacci terms
        for (int i = 0;i<30;i++){
            fib[i] = a;
            c = a+b;
            a = b;
            b = c;
        }

        ob.show(fib);
    }
}