import java.io.*;
class Penalty{
    int hr;
    double fine;
    
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter hours = ");
        hr = Integer.parseInt(br.readLine());
    }
    
    void calculate(){
        // calculating
        fine = (hr>10)?(hr-10)*100.0 : 0.0;
        
        // output
        System.out.print("Penalty = Rs."+fine+"\nHours of Parking = "+hr); 
    }
    public static void main()throws IOException{
        Penalty py = new Penalty();
        py.input();
        py.calculate();
    }
}