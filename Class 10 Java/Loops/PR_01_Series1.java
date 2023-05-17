class PR_01_Series1{
    static void series1(){
        // 0 1 2 3 6 11 ....
        int a = 0, b = 1,c = 2,d = 0,i=0; 
        
        System.out.print("0 1 2 ");
        do{
            d = a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
            i++;
        }while(i<10);
        System.out.println();
    }

    static void series2(){
        for (int i = 0;i<10;i++){
            if (i%2==1)
                System.out.print("-");

            System.out.print((2*i+1)+" ");
        }
        System.out.println();
    }

    static void series3(){
        // 0 3 8 15
        // 1^2-1  2^2-1  3^2-1 ...

        for (int i = 1;i<=10;i++){
            System.out.print((int)(Math.pow(i,2)-1)+" ");
        }
        System.out.println();
    }

    static void series4(){
        int n = 1;
        for (int i = 0;i<10;i++){
            System.out.print(n+" ");
            n = n*10+1;
        }
        System.out.println();
    }

    static void series5(){
        int n = 1;
        // 1*10+2 10+2
        for (int i = 1;i<=10;){
            System.out.print(n+" ");
            i++;
            if (i<10)
                n = n*10+i;
            else 
                n = n*10;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        series1();
        series2();
        series3();
        series4();
        series5();
    }
}