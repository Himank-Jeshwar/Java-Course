import java.util.Date;
public class CWH_07_Date_Class {
    public static void main(String[] args) {
        // counting of month starts from 0 .
        // Date (int year = year+1900,int month,int date , int hrs, int min)
        Date d = new Date(122,10,2,12,20);
        System.out.println(d.getTime()/(1000*3600*24*365l));// same as System.currentTimeMillis()
        System.out.println(d.getYear()+1900);
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getDay()); // returns the day number
        
    }
}
