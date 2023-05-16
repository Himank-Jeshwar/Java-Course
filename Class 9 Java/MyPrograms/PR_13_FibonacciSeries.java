class PR_13_FibonacciSeries{
    public static void main(String[] args) {
        int a = 0,b =1 ,c;
        do {
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        } while (a<=233);
    }
}