public class PR_02_Series2 {
    static void series1(int n){
        int a = 0 , b = 1,c = 1,i=1,sum = 0;
        do{
            System.out.print(c+" ");
            sum+=c;
            c = a+b;
            a=b;
            b=c;
            i++;
        }while(i<=n);
        System.out.println("\nSum of series 1 : "+sum);
    }

    static void series2(int n){
        int sum = 0;
        for (int i = 1,k=2;k<=n;i++,k+=2){
            if (i%2==1)
                sum+=k;
            else
                sum-=k;
        }
        System.out.print("Sum of series 2 = "+sum);
    }

    static void series3(int n){
        int sum = 0,subSum = 0;
        for (int i = 1;i<=n;i++){
            subSum+=i;
            sum+=subSum;
        }
        System.out.print("\nSum of the series 3 : "+sum);
    }

    static void series4(int n){
        int sum = 0,subProduct = 1;
        for (int i = 1;i<=n;i++){
            subProduct*=i;
            sum+=subProduct;
        }
        System.out.print("\nSum of the series 4 : "+sum);
    }

    static void series5(int n){
        double sum = 0,sumNume = 0,productDeno = 1;
        for (int i = 1;i<=n;i++){
            sumNume+=i;
            productDeno*=i;
            sum += (sumNume/productDeno);
        }
        System.out.println("\nSum of the series 5 = "+sum);
    }
    public static void main(String[] args) {
        int n = 4;
        series1(n);
        series2(n);
        series3(n);
        series4(n);
        series5(n);
    }
}
