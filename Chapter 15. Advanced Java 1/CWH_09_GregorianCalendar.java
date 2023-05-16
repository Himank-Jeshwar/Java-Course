import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
 class CWH_09_GregorianCalendar {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(c.getCalendarType()); // returns "gregory" by default 
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)); // 24-hour format
        
        System.out.println(gc.isLeapYear(2016));
        gc.set(2016, 9, 25);
        System.out.println(gc.get(GregorianCalendar.YEAR));
        
        for (String timezones : TimeZone.getAvailableIDs()) {
            System.out.println(timezones);
        }
        
    }
}
