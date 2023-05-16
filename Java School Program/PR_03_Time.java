import java.io.*;
public class PR_03_Time 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader m = new InputStreamReader(System.in);
        BufferedReader s = new BufferedReader(m);
        int sec;
        System.out.print("Enter Seconds = ");
        sec = Integer.parseInt(s.readLine());
        int hrs = sec/3600;
        int ls = sec%3600;
        int mins = ls/60;
        ls%=60;
        System.out.println(hrs+" hours "+mins+" minutes "+ls+" seconds");

    
    }
}