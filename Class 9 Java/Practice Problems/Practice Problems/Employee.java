import java.io.*;
class Employee{
    // declaration
    String n; double b;
    void input () throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter your name = ");
        n = br.readLine();
        System.out.print("Enter basic pay (in Rs.) = ");
        b = Double.parseDouble(br.readLine());
    }
    
    void display(){
        // declaration
        double bonus = 0.0,totalPay = 0.0;
        
        // calculation
        bonus = 12.5*b/100;
        totalPay = bonus + b;
        
        // output
        System.out.println("Name - "+n+"\nBasic Pay = Rs."+b);
        System.out.print("Total Pay = Rs."+totalPay);
    }
    public static void main()throws IOException{
        Employee emp = new Employee();
        emp.input();
        emp.display();
    }
}