import java.util.Scanner;

class SimpleInterest {
    private double principal,rate,time;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum of money (in Rs.) = ");
        principal = sc.nextDouble();
        System.out.print("Enter rate = ");
        rate = sc.nextDouble();
        System.out.print("Enter time (in years) = ");
        time = sc.nextDouble();
        sc.close();
    }
    void calculateAmount(){
        // compound interest for 1st year = simple interest for 1st year
        double amt = 0;
        for (int i = 1;i<=time;i++){
            double si = principal*rate*0.01;
            amt = principal+si;
            System.out.println("Amount after each year : Rs."+amt);
            principal=amt;
        }
    }
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.input();
        si.calculateAmount();
    }    
}
