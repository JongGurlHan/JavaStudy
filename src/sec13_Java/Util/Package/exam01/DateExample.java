package sec13_Java.Util.Package.exam01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(now));

        Calendar now2 = Calendar.getInstance();

        int year = now2.get(Calendar.YEAR);
        System.out.println(year);


    }
}
