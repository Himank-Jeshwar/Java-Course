class PR_01_Power{
    static int power (int base,int i){

        if (i==0)
            return 1;
        else
            return base*power(base,i-1);

    }
    public static void main(String[] args) {
        int base = 5,b = 1;

        b = power(base,4);
        System.out.println(b);
    }
}