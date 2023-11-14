import java.util.*;
class PR_42_FactorialAndSum{
    int a[],ch;
    public PR_42_FactorialAndSum(){
        a = new int [10];
        ch = 0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers :");
        for (int i = 0;i<10;i++)
            a[i] = sc.nextInt();
        System.out.print("Enter choice : ");
        ch = sc.nextInt();
    }

    
    void factorial(){
        int f;
        if (ch==1){
            for (int i = 0;i<10;i++){
                f = 1;
                for (int j = 1;j<=a[i];j++)
                    f*=j;
                System.out.println(a[i]+"! = "+f);
            }
        }
    }

    void sum(){
        int s = 0;
        if (ch==2){
            for (int i = 0;i<10;i++)
                if (a[i]%2==1)
                    s+=a[i];
            System.out.print("Sum of odd numbers: "+s);
        }
    }

    public static void main(String[] args) {
        PR_42_FactorialAndSum ob = new PR_42_FactorialAndSum();
        ob.input();
        ob.factorial();
        ob.sum();
    }
}