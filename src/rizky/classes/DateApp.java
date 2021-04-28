package rizky.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date(2358720000L);
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2010);
        //calendar.add(Calendar.YEAR,-20); // mengurangi tahun
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY,16);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
