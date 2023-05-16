import java.io.*;
public class PR_01_Marks 
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader m = new InputStreamReader(System.in);
        BufferedReader marks = new BufferedReader(m);
        System.out.print("Enter Marks For RA1 = ");
        double ra1 = Double.parseDouble(marks.readLine());
        System.out.print("Enter Marks For RA2 = ");
        double ra2 = Double.parseDouble(marks.readLine());
        double total = ra1+ra2;
        System.out.println("Total Marks = "+total);
    }    
}