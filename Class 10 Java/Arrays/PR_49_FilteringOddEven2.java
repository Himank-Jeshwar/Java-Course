import java.util.*;
class PR_49_FilteringOddEven2 {
    int All[],Odd[],Even[];
    
    void input (){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        n = sc.nextInt();
        All = new int[n];

        System.out.println("Enter "+n+" numbers");
        for (int i = 0;i<n;i++)
            All[i] = sc.nextInt();
    }


    void Get2from1(){
        int oddCount = 0,evenCount = 0;
        int num = 0,s = 0,p = 0,q = 0;

        for (int i = 0;i<All.length;i++){
            // initialization
            num = All[i];

            while(num>9){
                s = 0;
                for (int j = num;j>0;j/=10)
                    s+=j%10;      
                num = s;   
            }

            if (num%2==0)
                evenCount++;
            else
                oddCount++;
        }

        Odd = new int [oddCount];
        Even = new int [evenCount];
        
        for (int i = 0;i<All.length;i++){
            num = All[i];
            s = 0;
            while(num>9){
                for (int j = num;j>0;j/=10)
                    s+=j%10;      
                num = s;   
            }

            if (num%2==0)
                Even[p++] = All[i];
            else
                Odd[q++] = All[i];
        }
    }

    void show(int a[]){
        for (int i = 0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        PR_49_FilteringOddEven2 ob = new PR_49_FilteringOddEven2();
        ob.input();
        ob.Get2from1();
        System.out.print("All [] = ");
        ob.show(ob.All);
        System.out.print("Odd [] = ");
        ob.show(ob.Odd);
        System.out.print("Even [] = ");
        ob.show(ob.Even);
    }    
}
