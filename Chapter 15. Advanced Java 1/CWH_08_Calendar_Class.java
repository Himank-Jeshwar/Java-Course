import java.util.Calendar;
 class CWH_08_Calendar_Class {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType()); // returns "gregory" by default 
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
