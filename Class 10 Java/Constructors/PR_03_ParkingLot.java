import java.util.Scanner;

class PR_03_ParkingLot {
    // declaration
    int vno;    
    int hours;
    double bill;

    PR_03_ParkingLot(){
        vno = 0;
        hours = 0;
        bill = 0.0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number : ");
        vno = sc.nextInt();
        System.out.print("Enter hours of parking : ");
        hours = sc.nextInt();
    }

    void calculate(){
        if (hours<=1)
            bill = 3.0;
        else 
            bill = 3.0+(1.5*(hours-1));
    }

    void display(){
        System.out.println("Vehicle number : "+vno+"\nHours of parking : "+hours);
        System.out.println("Parking bill : Rs. "+bill);
    }
    public static void main(String[] args) {
        PR_03_ParkingLot pLot = new PR_03_ParkingLot();
        pLot.input();
        pLot.calculate();
        pLot.display();
    }
}
