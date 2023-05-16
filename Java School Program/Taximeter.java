import java.io.*;
public class Taximeter {
    public static void main(String[] args)throws IOException {
        // declaration
        String cabNo; double dist,bill = 0.0;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter cab number - ");
        cabNo = br.readLine();
        System.out.print("Enter distance travelled (in km) = ");
        dist = Double.parseDouble(br.readLine());

        // decision
        if (dist<=5)
            bill=60.0;
        else
            if (dist<=15)
                bill=60+(dist-5)*12;
            else
                if (dist<=35)
                    bill=60+10*12+(dist-15)*10;
                else
                    bill=60+10*12+20*10+(dist-35)*8;
        
        // output
        System.out.print("Cab number - "+cabNo+"\nDistance Travelled - "+dist+" km\nBill Payable - Rs."+bill);
    }    
}