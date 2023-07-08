import java.util.*;
class ASG_10_Time {
    int h,m,s;
    ASG_10_Time(){
        h = 0;
        m = 0;
        s = 0;
    }
    void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter hours : ");
        h = sc.nextInt();
        System.out.print("Enter minutes : ");
        m = sc.nextInt();
        System.out.print("Enter seconds : ");
        s = sc.nextInt();
    }
    void print(){
        System.out.println(h+":"+m+":"+s);
    }
    void add(){
        int sec;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter seconds to add : ");
        sec = sc.nextInt();
        
        // calculation
        h+=sec/3600;
        sec%=3600;
        m+=sec/60;
        sec = sec%60;
        s+=sec;

        if (s>=60){
            s-=60;
            m++;
        }
        
        if (m>=60){
            m-=60;
            h++;
        }
    }
    public static void main(String[] args) {
        ASG_10_Time t = new ASG_10_Time();
        t.accept();
        t.print();
        t.add();
        t.print();        
    }    
}
