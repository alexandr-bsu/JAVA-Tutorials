package DateTutorial;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Executor {
    public void execute() throws Exception{
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
//      Добавляем неделю
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println(calendar.getTime());
//      Форматирование даты
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
//      Свой формат даты
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date parsed_date = simpleDateFormat.parse("25_04_02");
        System.out.println(parsed_date);
    }
}
