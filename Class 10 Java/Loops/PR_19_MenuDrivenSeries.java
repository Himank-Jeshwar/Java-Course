import java.util.*;
class PR_19_MenuDrivenSeries {
    static void sumOfSeries1(int x){
        int sum = 0;
        for (int i = 1;i<=20;i++){
            if(i%2==1)
                sum+=(int)(Math.pow(x,i));
            else
                sum-=(int)(Math.pow(x,i));
        }
        System.out.print("Sum of series 1 : "+sum);
    }

    static void sumOfSeries2(int a,int n){
        double sum = 0.0;
        for (int i = 1;i<=n;i++){
            sum+=(1/Math.pow(a,2*i));
        }
        System.out.print("Sum of series 2 : "+sum);
    }
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("User's Choice : \n1 - Sum of Series 1\n2 - Sum of Series 2");   
        ch = sc.nextInt();

        switch(ch){
            case 1:
                int x;
                System.out.print("Enter value for x : ");
                x = sc.nextInt();
                sumOfSeries1(x);
                break;
            case 2:
                int a,n;
                System.out.print("Enter value for a : ");
                a = sc.nextInt();
                System.out.print("Enter number of terms : ");
                n = sc.nextInt();
                sumOfSeries2(a, n);
                break;
            default:
                System.out.println("Invalid option!");
        }
        sc.close();
    }    
}
