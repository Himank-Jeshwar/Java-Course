import java.util.*;
class PR_06_Adder {
    int a[];

    public PR_06_Adder(){
        a = new int[2];
        a[0] = 0;
        a[1] = 0;
    }

    void readtime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours : ");
        a[0] = sc.nextInt();
        System.out.print("Enter minutes : ");
        a[1] = sc.nextInt();
    }

    void addtime(PR_06_Adder X,PR_06_Adder Y){
        if (this.a[1]<60)
            this.a[1] = X.a[1]+Y.a[1];
        else{
            this.a[1] = this.a[1]-60;
            this.a[0]++;
            this.a[1] += X.a[1]+Y.a[1];
        }

        if (this.a[1]>60){
            this.a[1] = this.a[1]-60;
            this.a[0]++;
        }

        this.a[0]+=X.a[0]+Y.a[0];
    }

    void disptime(){
        System.out.println(this.a[0]+" hours "+this.a[1]+" minutes");
    }

    public static void main(String[] args) {
        PR_06_Adder time1 = new PR_06_Adder();
        PR_06_Adder time2 = new PR_06_Adder();
        PR_06_Adder sumTime = new PR_06_Adder();

        time1.readtime();
        time2.readtime();

        sumTime.addtime(time1, time2);
        sumTime.disptime();
    }
}
