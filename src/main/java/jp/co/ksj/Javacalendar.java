package jp.co.ksj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Javacalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);

		calendar.set(1998, 01, 19);
		Date birthday = calendar.getTime();
		System.out.println(birthday);

		calendar.clear();
		calendar.set(2020, 0, 2, 10, 20, 30);
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println(calendar.get(Calendar.YEAR));
		calendar.add(Calendar.HOUR_OF_DAY, +20);
		System.out.println(calendar.getTime());

		calendar.clear();
		calendar.set(2021, 6, 3, 14, 32, 30);

		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 (E) hh:mm:ss");
		String formatDate = format.format(calendar.getTime());

		System.out.println(formatDate);

	}

}
