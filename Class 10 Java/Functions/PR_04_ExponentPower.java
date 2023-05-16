class PR_04_ExponentPower {
    int power(int m){
        return m*m;
    }
    int power(int m,int n){
        int base = m;
        for (int i = 0;i<(n-1);i++){
            m*=base;
        }
        return (n==0)?1:m;
    }

    public static void main(String[] args) {
        PR_04_ExponentPower expPower = new PR_04_ExponentPower();
        int ans = expPower.power(9);        
        System.out.println(ans);
    }
}
