import java.util.*;

class PR_26_Convert {
    int h,m,s;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente seconds :");
        s = sc.nextInt();
    }

    void calculate(){
        int sec; // declaration

        h = s/(60*60);
        sec = s%(60*60);
        m = sec/60;
        sec%=60;
        s = sec;
    }

    void display(){
        System.out.print(h+" Hour(s) "+m+" Minute(s) "+s+" Second(s)");
    }
    
    public static void main(String[] args) {
        PR_26_Convert obj = new PR_26_Convert();   
        obj.input();
        obj.calculate();
        obj.display();
    }
}
