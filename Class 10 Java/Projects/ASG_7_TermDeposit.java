import java.util.*;
class ASG_7_TermDeposit {
   
    public static void main(String[] args) {
        int age,term;
        double p,ist=0.0,amt=0.0;
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter amount deposited : ");
        p = sc.nextDouble();

        System.out.print("Enter age : ");
        age = sc.nextInt();

        System.out.print("Enter term (years) : ");
        term = sc.nextInt();

        if (term<=0){
            System.out.print("Term cannot be zero or negative.");
            System.exit(0);
        }

        // calculating interest for general
        if (age<60){
            switch(term){
                case 1:
                    ist = 7.5*p/100;
                    break;
                case 2:
                    ist = 8.5*p/100;
                    break;
                case 3:
                    ist = 9.5*p/100;
                    break;
    
                default:
                    ist = 10.0*p/100;
            }
        }

        // calculating interest for senior citizen
        else {
            switch(term){
                case 1:
                    ist = 8.0*p/100;
                    break;
                case 2:
                    ist = 9.0*p/100;
                    break;
                case 3:
                    ist = 10.0*p/100;
                    break;
    
                default:
                    ist = 11.0*p/100;
            }
        }
        amt = p+ist;
        System.out.println("Amount Deposited\tTerm\tAge\tInterest earned\tAmount Paid");
        System.out.print(p+"\t"+term+"\t"+age+"\t"+ist+"\t"+amt);
    }
}
