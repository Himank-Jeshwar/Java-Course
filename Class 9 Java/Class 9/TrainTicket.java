import java.io.*;
public class TrainTicket {
    public static void main(String[] args)throws IOException {
        // declaration
        String name,coach; long mobno; int amt , totalamt = 0;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name - ");
        name = br.readLine();
        System.out.print("Choose the type of coach you want :- \n");
        System.out.println("First_AC\nSecond_AC\nThird_AC\nSleeper_AC\n");
        coach = br.readLine();
        System.out.print("Enter your mobile number - ");
        mobno = Long.parseLong(br.readLine());
        System.out.print("Enter a basic amount - ");
        amt = Integer.parseInt(br.readLine());
        
        // decision
        if (coach.equals("First_AC"))
            totalamt = amt+700;
        else
            if (coach.equals("Second_AC"))
                totalamt = amt+500;
            else 
                if (coach.equals("Third_AC"))
                    totalamt = amt+250;
                else
                    totalamt = amt+0;
        
        // output
        System.out.println("Name - "+name+"\tCoach - "+coach+"\nMobile Number - "+mobno);
        System.out.print("Total Amount Payable - Rs."+totalamt);
    }
}
