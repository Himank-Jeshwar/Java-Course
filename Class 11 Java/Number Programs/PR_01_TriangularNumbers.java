import java.util.*;
class PR_01_TriangularNumber{
    int n;

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }

    void display(){
        int s = 0;
        String nos = "";

        for (int i = 2;s<=n;i++){
            s=0;
            for (int j = 1;j<=i;j++){
                s+=j;
            }

            if (s>n)
                break;
            System.out.println(s);
            nos+=s+" ";

        }
        System.out.println(nos);
    }
    public static void main(String[] args) {
        PR_01_TriangularNumber ob = new PR_01_TriangularNumber();
        ob.input();
        ob.display();    
       }
}