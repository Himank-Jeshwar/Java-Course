import java.util.Scanner;

class ASG_1_TaxiBill {
    public static void main (String []args){
        double d , fare = 0.0; // declaration

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter distance : ");
        d = sc.nextDouble();

        if (d>0&&d<=3)
            fare = 45.0;
        else 
            if (d>3&&d<=10)
                fare = 45+15.0*(d-3);
            else 
                if (d>10&&d<=35)
                    fare = 45+15*7+(d-10)*16.2;
                else
                    if (d>35)
                        fare = 45+15*7+16.2*25+(d-35)*20.0;
                    else 
                        fare = 0.0;
        System.out.println("Fare : Rs."+fare);
    }
}
