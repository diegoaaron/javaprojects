import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Archivo6 {
    public static void main(String[] args){
        // forma vieja, antes de java 8
        Calendar c = Calendar.getInstance();
        Date d2 = new Date();

        // forma nueva
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d + " | " + t + " | " + dt);

        //
        LocalDate date = LocalDate.of(1980, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(8,1,12);
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("01 02 1995", f);
        time = LocalTime.parse("11:22");
        System.out.println(date);
        System.out.println(time);
    }
}
