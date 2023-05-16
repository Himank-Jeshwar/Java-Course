import java.util.*;
class PR_57_Employee_Sal {
    // declaration
    String name,empno;
    int basic;
    double gross,net;    

    PR_57_Employee_Sal(String name,String empno,int basic){
        this.name = name;
        this.empno = empno;
        this.basic = basic;
        gross = 0.0;
        net = 0.0;
    }

    void compute(){
        double da,hra,pf; // declaration

        // calculation
        da = 30*basic/100.0;
        hra = 15*basic/100.0;
        pf = 12*basic/100.0;
        gross = basic+da+hra;
        net = gross-pf;


    }

    void display(){
        System.out.println("Name : "+name+"\nempno :"+empno);
        System.out.println("Gross salary : Rs."+gross+"\nNet salary : Rs."+net);
    }

    public static void main(String[] args) {
        String n,emp;
        int basic;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,empno,basic respectively :");
        n = sc.nextLine();
        emp = sc.nextLine();
        basic = sc.nextInt();

        PR_57_Employee_Sal obj = new PR_57_Employee_Sal(n, emp, basic);
        obj.compute();
        obj.display();
    }
}
