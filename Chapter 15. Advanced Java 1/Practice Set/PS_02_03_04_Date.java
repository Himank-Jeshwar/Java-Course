import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class PS_02_03_04_Date {
    public static void main(String[] args) {
        // PS_02
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        
        // PS_03
        Calendar cd = Calendar.getInstance();
        System.out.println(cd.get(Calendar.HOUR_OF_DAY)+":"+cd.get(Calendar.MINUTE)+":"+cd.get(Calendar.SECOND));
        
        // PS_04
        LocalTime lt = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time = lt.format(formatter);
        System.out.println(time);         
    }
}
