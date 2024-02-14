class PR_26_Pattern {
    void show (){
        int k = 65;
        char ch = 'A';
        for (int i = 4;i>0;i--){
            for (int j = 0;j<i;j++)
                if (i%2==0)
                    System.out.print((k++)+" ");
                else
                    System.out.print((ch++) + " ");
            System.out.println();
        }
    }

    void show(int p){
        boolean isPrime = false;
        int d = 0;
        System.out.println("Prime digits are : ");
        while (p>0) {
            d = p%10;
            isPrime = (d==1)?false:true;

            for (int i = 2;i<=d/2;i++){
                if (d%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime==true)
                System.out.print(d+" ");
            p/=10;
        }
        System.out.println();
    }

    void show(String s){
        for (int i = 0;i<s.length();i++){
            for (int j = 0;j<=i;j++)
                System.out.print(s.charAt(j)+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PR_26_Pattern ob = new PR_26_Pattern();
        ob.show();
        System.out.println();
        ob.show(4329);
        System.out.println();
        ob.show("BLUEJ");
    }
}
