import java.io.*;
public class WeekDay {
    public static void main(String[] args) throws IOException{
        // declaration
        int weekNum;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number between 1-7 (all inclusive) = ");
        weekNum = Integer.parseInt(br.readLine());

        // decision
        if (weekNum>0&&weekNum<8)
            if (weekNum==1)
                System.out.print("Monday");
            else
                if (weekNum==2)
                    System.out.print("Tuesday");
                else
                    if (weekNum==3)
                        System.out.print("Wednesday");
                    else
                        if (weekNum==4)
                            System.out.print("Thursday");
                        else
                            if (weekNum==5)
                                System.out.print("Friday");            
                            else
                                if (weekNum==6)
                                    System.out.print("Saturday");
                                else
                                    System.out.print("Sunday");
        else
            System.out.print("Invalid Number!");
    }
}
