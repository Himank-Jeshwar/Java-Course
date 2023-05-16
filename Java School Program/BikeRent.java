import java.util.*;

class BikeRent {
    String bno,name;
    int days,charge;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bike number : ");
        bno = sc.next();
        System.out.print("Enter name :");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter number of days :");
        days = sc.nextInt();
    }

    void compute(){
        if (days<=5)
            charge = 500*days;
        else 
            if (days<=10)
                charge = 500*5 + 400*days;
            else 
                charge = 500*5 + 400*10 + 200*days;
    }

    void display(){
        System.out.println("Bike No. : "+bno+"\nName : "+name);
        System.out.print("No. of days : "+days+"\nCharge : Rs."+charge);
    }

    public static void main(String[] args) {
        BikeRent bkrent = new BikeRent();
        bkrent.input();
        bkrent.compute();
        bkrent.display();
    }
}
