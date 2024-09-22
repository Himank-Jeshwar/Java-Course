class PR_11_GCD{
    static int gcd(int a,int b){
        int t=0,r=0;

        int divisor = Math.min(a,b);
        int dividend = Math.max(a,b);

        r = dividend%divisor;
        while(r!=0){
            t = divisor; // old divisor
            divisor = r;
            dividend = t;
            r = dividend%divisor;
        }

        return divisor;
    }
    public static void main(String[] args) {
        System.out.println(gcd (24,36));
    }
}