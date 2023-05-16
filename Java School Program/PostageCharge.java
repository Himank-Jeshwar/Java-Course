import java.util.*;
class PostageCharge {
    public static void main(String[] args) {
        // declaration
        double weight,charge = 5.0;
        
        //inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight : ");
        weight = sc.nextDouble();

        // decision
        if (weight>25)
            charge+=0.5*(int)((weight-25)/10);

        // output
        System.out.println("Postage charge = Rs."+charge);
    }    
}
