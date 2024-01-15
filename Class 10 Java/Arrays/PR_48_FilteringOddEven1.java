import java.util.*;
class PR_48_FilteringOddEven1 {
    int All[],Odd[],Even[];
    
    void input (){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        n = sc.nextInt();
        All = new int[n];
        Odd = new int[n/2];
        Even = new int[(n+1)/2]; // allocation of space

        System.out.println("Enter "+n+" numbers");
        for (int i = 0;i<n;i++)
            All[i] = sc.nextInt();
    }


    void Get2from1(){
        int p = 0,q = 0; // indexes of the two arrays Odd[] and Even[]
        for (int i = 0;i<All.length;i++){
            if (i%2==0)
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
        PR_48_FilteringOddEven1 ob = new PR_48_FilteringOddEven1();
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
