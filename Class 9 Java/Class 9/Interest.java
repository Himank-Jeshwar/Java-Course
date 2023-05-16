import java.io.*;
class Interest{
    public static void main ()throws IOException{
        // declaration
        double p,r,t; char interest;
        double i;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\t\tPress 'S' for Simple Interest\n\t\t\tPress 'C' for Compound Interest");
        interest = br.readLine().charAt(0);
        
        
        // decision and calculation
        switch (interest){
            case 'S':
                System.out.print("Enter Principal (in Rs.) = ");
                p = Double.parseDouble(br.readLine());
                System.out.print("Enter rate = ");
                r = Double.parseDouble(br.readLine());
                System.out.print("Enter time in years = ");
                t = Double.parseDouble(br.readLine());
                
                i = p*r*t/100;
                System.out.print("Simple Interest in "+t+" years in Rs. = "+i);
                break;
                
            case 'C':
                System.out.print("Enter Principal (in Rs.) = ");
                p = Double.parseDouble(br.readLine());
                System.out.print("Enter rate = ");
                r = Double.parseDouble(br.readLine());
                System.out.print("Enter time in years = ");
                t = Double.parseDouble(br.readLine());
                
                i = p*(Math.pow((1+r/100),t)-1);
                System.out.print("Compound Interest in "+t+" years = Rs."+i);
                break;
                
            default:
                System.out.print("Invalid choice\n\tTry Again.");
        }
    }
}