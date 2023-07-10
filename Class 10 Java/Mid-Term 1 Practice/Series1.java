class Series1 {
    public static void main(String[] args) {
        int a = 0,b = 1,c = 2,d = 0;
        for (int i = 0;i<10;i++){
            d = a+b+c;
            System.out.print(a+" ");
            a = b;
            b = c;
            c = d;
        }
    }    
}
