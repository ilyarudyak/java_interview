package liang;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ilyarudyak on 6/21/16.
 */
public class CalendarDemo {

    public static void main(String[] args) {

        Calendar calendar = GregorianCalendar.getInstance();

        System.out.println("Current time is " + new Date());

        System.out.println("YEAR:\t" + calendar.get(Calendar.YEAR));
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH));
        System.out.println("DATE:\t" + calendar.get(Calendar.DATE));
    }

}
