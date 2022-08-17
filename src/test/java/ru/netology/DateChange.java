package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateChange {
    public String dateChangeDay() {
        Calendar calendar = new GregorianCalendar();
        calendar.roll(Calendar.DAY_OF_MONTH, 3);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String text = sdf.format(calendar.getTime());

        return text;
    }

    public String dateChangeWeek() {
        Calendar calendar = new GregorianCalendar();
        calendar.roll(Calendar.DAY_OF_MONTH, 7);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String text = sdf.format(calendar.getTime());

        return text;
    }

}
