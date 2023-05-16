import java.io.*;
class DaysInAMonth {
    public static void main(String[] args)throws IOException {
        // declaration
        int monthNum,year,days;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a month number : ");
        monthNum = Integer.parseInt(br.readLine());

        // decision
        if (monthNum>0&&monthNum<13){
            if (monthNum==1||monthNum==3||monthNum==5||monthNum==7||monthNum==8||monthNum==10||monthNum==12)
                days = 31;
            else
                if (!(monthNum==1||monthNum==3||monthNum==5||monthNum==7||monthNum==8||monthNum==10||monthNum==12||monthNum==2))
                    days = 30;
                else{
                    System.out.print("Enter year : ");
                    year = Integer.parseInt(br.readLine());
                    if (year%100!=0&&year%4==0)
                        days = 29;
                    else if (year%400==0)
                        days = 29;
                    else 
                        days = 28;
                    }
            System.out.print("This month has "+days+" days.");
        }
        else
            System.out.print("Not a valid month number !");
        }
    }

