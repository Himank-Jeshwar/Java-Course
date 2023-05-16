import java.io.*;
public class PR_11_Time {
    public static void main(String[] args) throws IOException{
        InputStreamReader inp = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (inp);
        System.out.print("Enter seconds = ");
        int sec = Integer.parseInt(br.readLine());
        int hrs = sec/3600;
        int s = sec%3600;
        int mins = s/60;
        s%=60;
        System.out.println(hrs+" hours "+mins+" minutes "+s+" seconds"); 
    }
};
