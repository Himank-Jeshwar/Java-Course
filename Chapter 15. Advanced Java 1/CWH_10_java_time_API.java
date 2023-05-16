import java.time.*;
import java.time.format.DateTimeFormatter;
public class CWH_10_java_time_API {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // date
        LocalDateTime ldt = LocalDateTime.now();
        // System.out.println(ldt);

        // format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("||dd-MM-yyyy -- E H:m||");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;

        // date + format
        String date = ldt.format(dtf);
        System.out.println(date);
    }
}
