package dates;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import static util.Common.sy;
/**获得年月日、时分秒,一个月的最后一天，格式化日期
 * Created by xufuxiu on 2017/9/18.
 */
public class DateTimeTest
{
    public static void main(String[] args)
    {
        Calendar cal=Calendar.getInstance();
        /*sy(cal.get(Calendar.YEAR));
        sy(cal.get(Calendar.MONTH));
        sy(cal.get(Calendar.DATE));
        sy(cal.get(Calendar.HOUR_OF_DAY));
        sy(cal.get(Calendar.MINUTE));
        sy(cal.get(Calendar.SECOND));
        sy(cal.getTimeInMillis());
        sy(System.currentTimeMillis());
        sy(Clock.systemDefaultZone().millis());
        sy(cal.getActualMaximum(Calendar.DAY_OF_MONTH));*/




        LocalDateTime dt=LocalDateTime.now();
        /*sy(dt.getYear());
        sy(dt.getMonth());
        sy(dt.getDayOfMonth());
        sy(dt.getHour());
        sy(dt.getMinute());
        sy(dt.getSecond());*/

        /**
         * 格式化日期
         */
        SimpleDateFormat oldFormatter=new SimpleDateFormat("yyyy/MM/dd");
        Date date1=new Date();//获得当前日期
        sy(oldFormatter.format(date1));

        DateTimeFormatter newFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2=LocalDate.now();//获得当前日期
        sy(date2.format(newFormatter));

        yesterdayCurrent1();
        yesterdayCurrent2();

    }
    public static void yesterdayCurrent1()
    {//打印昨天的当前时刻
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        sy(cal.getTime());
    }
    public static void yesterdayCurrent2()
    {
        LocalDateTime today=LocalDateTime.now();
        LocalDateTime yesterday=today.minusDays(1);
        sy(yesterday);
    }
}
