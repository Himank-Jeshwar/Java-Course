import java.io.*;
class LeapYear{
    public static void main() throws IOException{
        // declaration
        int year;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter year = ");
        year = Integer.parseInt(br.readLine());
        // decision
        if (year%4==0&&year%100!=0)
            System.out.print("a Leap year");
        else if (year%400==0&&year%100==0)
            System.out.print("a Century leap year");
        else if (year%400!=0&&year%100==0)
            System.out.print("a Century year but not a Leap year");
            
    }
}