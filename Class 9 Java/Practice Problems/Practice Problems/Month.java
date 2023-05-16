import java.io.*;
class Month{
    int m;
    void input()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter month number = ");
        m = Integer.parseInt(br.readLine());
    }
    
    void show()throws IOException{
        int days = 0;
        switch(m){
            case 1:
                days = 31;
                System.out.print("No. of days = "+days);
                break;
            case 2:
                int yr;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter year = ");
                yr = Integer.parseInt(br.readLine());
                if (yr%100!=0&&yr%4==0)
                    days = 29;
                else
                    if (yr%400==0)
                        days = 29;
                    else
                        days = 28;
                System.out.print("No. of days = "+days);
                break;
                
            case 3:
                days = 31;
                System.out.print("No. of days = "+days);
                break; 
            
            case 4:
                days = 30;
                System.out.print("No. of days = "+days);
                break;
            
            case 5:
                days = 31;
                System.out.print("No. of days = "+days);
                break;
                
            case 6:
                days = 30;
                System.out.print("No. of days = "+days);
                break;
            
            case 7:
                days = 31;
                System.out.print("No. of days = "+days);
                break;
                
            case 8:
                days = 31;
                System.out.print("No. of days = "+days);
                break;
                
            case 9:
                days = 30;
                System.out.print("No. of days = "+days);
                break;
                
            case 10:
                days = 31;
                System.out.print("No. of days = "+days);
                break;
                
            case 11:
                days = 30;
                System.out.print("No. of days = "+days);
                break;
                
            case 12:
                days = 31;
                System.out.print("No. of days = "+days);
                break;
                
            default:
                System.out.print("INVALID INPUT");
        }
    }
    
    public static void main()throws IOException{
        Month mh = new Month();
        mh.input();
        mh.show();
    }
}