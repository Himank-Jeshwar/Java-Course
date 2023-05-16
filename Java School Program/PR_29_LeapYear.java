import java.io.*;
public class PR_29_LeapYear {
    public static void main(String[] args)throws IOException {
        // declaration
        int year;String msg;

        // input
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.print("Enter year : ");
        year = Integer.parseInt(br.readLine());

        // decision
        if (year%4==0){
            if (year%100==0&&year%400==0)
                msg = "Century Leap Year";
            else
                if (year%100==0&&year%400!=0)
                    msg = "Century Year But Not A Leap Year";
                else 
                    msg = "Leap Year";
             System.out.print(msg);
        }
    }
}
