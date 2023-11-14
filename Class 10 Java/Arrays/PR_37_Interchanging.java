import java.util.*;
class PR_37_Interchanging{
    String a[];
    public PR_37_Interchanging(){
        a = new String[10];
    }

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 words:");
        for (int i = 0;i<10;i++)
            a[i] = sc.next();            
    }

    void interchange(){
        for (int i = 0;i<10;i++)
            a[i] = a[i].charAt(a[i].length()-1)+a[i].substring(1,a[i].length()-1)+a[i].charAt(0);
    }

    void show(){
        for (int i = 0;i<10;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        PR_37_Interchanging ob = new PR_37_Interchanging();
        ob.input();
        System.out.print("Original list of words : ");
        ob.show();
        System.out.print("New List of words :");
        ob.interchange();
        ob.show();
    }
}