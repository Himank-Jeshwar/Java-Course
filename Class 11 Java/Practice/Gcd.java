class Gcd {
    static int hcf(int x,int y){
        for (int i = x*y;i>=1;i--)
            if (x%i==0 && y%i == 0)
                return i;
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(hcf(65,39));
    }    
}
