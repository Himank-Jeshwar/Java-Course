import java.io.*;
class Amount{
    public static void main()throws IOException{
        // declaration
        double p,r,amt;
        int choice,n;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 for Term Deposit\nPress 2 for Recurring Deposit");
        choice = Integer.parseInt(br.readLine());
        
        // decision and calculation
        switch(choice){
            case 1:
                System.out.print("Enter principal in Rs.= ");
                p = Double.parseDouble(br.readLine());
                System.out.print("Enter rate = ");
                r = Double.parseDouble(br.readLine());
                System.out.print("Enter time in years = ");
                n = Integer.parseInt(br.readLine());
                amt = p*Math.pow((1+r/100),n);
                System.out.print("Amount = Rs."+amt);
                break;
            
            case 2:
                System.out.print("Enter principal in Rs.= ");
                p = Double.parseDouble(br.readLine());
                System.out.print("Enter rate = ");
                r = Double.parseDouble(br.readLine());
                System.out.print("Enter time in months = ");
                n = Integer.parseInt(br.readLine());
                amt = p*n+(n*(n+1)/2)*r/1200;
                
                System.out.print("Amount = Rs."+amt);
                break;
            
            default:
                System.out.print("Incorrect Input\n\tPlease try again.");
        }
        
    }
}