import java.util.*;
class PR_38_Numbers2_Digit {
    int a[][],n,m;
    
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n :");
        n = sc.nextInt();
        System.out.print("Enter m :");
        m = sc.nextInt();

        if (m>=3&&m<=7&&n>=3&&n<=7)
            a = new int[n][m];
        else{
            System.out.println("Invalid range must be within (3-7 inclusive): ");
            System.exit(0);
        }

        System.out.println("Enter numbers : ");
        for (int i = 0;i<n;i++)
            for (int j = 0;j<m;j++)
                a[i][j] = sc.nextInt();
        
    }

    void show(){
        // declaration
        double avg = 0;
        int c = 0;

        System.out.println("Numbers having more than 2-Digits :");
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (a[i][j]>99){
                    System.out.println(a[i][j]);
                    avg+=a[i][j];
                    c++;
                }
            }
        }
        avg=avg/c;// finding average
        System.out.println("Average = "+avg);
        System.out.println("Count : "+c);
    }    
    public static void main(String[] args) {
        PR_38_Numbers2_Digit ob = new PR_38_Numbers2_Digit();
        ob.input();
        ob.show();        
    }    
}
