import java.util.*;
class PR_06_Telcall {
    long phno;
    String name;
    int n;
    double amt;

    public PR_06_Telcall(long phno,String name,int n){
        this.phno = phno;
        this.name = name;
        this.n = n;
    }

    void compute(){
        if (n<=100)
            amt = 500;
        else
            if (n<=200)
                amt = (n-100)+500;
            else
                if (n<=300)
                    amt = 100 + 500 + 1.2*(n-200);
                else
                    amt = 100 + 500 + 1.2*100 + 1.5*(n-300);

    }
    
    void dispdata(){
        System.out.println("Phone Number\t"+phno);
        System.out.println("Name\t"+name);
        System.out.println("Total calls\t"+n);
        System.out.println("Amount\t"+amt);
    }
    public static void main(String[] args) {
        long phno;
        String name;
        int n;
        
        PR_06_Telcall ob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number : ");
        phno = sc.nextLong();

        System.out.print("Enter name : ");
        name = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter total number of calls : ");
        n = sc.nextInt();

        ob = new PR_06_Telcall(phno, name, n);
        ob.compute();
        ob.dispdata();
    }
}
