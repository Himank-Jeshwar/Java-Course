import java.io.*;
class Expenditure{
    // declaration
    double salary,rent,edu,pf;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter salary (in Rs.) = ");
        salary = Double.parseDouble(br.readLine());
    }
    void show(){
        // calculation
        pf = salary*12/100;
        rent = (salary-pf)*10/100;
        edu = (salary-pf)*20/100;
    
        // output
        System.out.println("Provident fund = Rs."+pf);
        System.out.print("Amount Spent on Education = Rs."+edu+"\nAmount Spent on Rent = Rs."+rent);
    }
    public static void main()throws IOException{
        Expenditure exp = new Expenditure();
        exp.input();
        exp.show();
    }
}