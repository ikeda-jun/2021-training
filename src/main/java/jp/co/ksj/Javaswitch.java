package jp.co.ksj;

import java.util.Calendar;

public class Javaswitch {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		String dayOfWeek;

		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "日";
			break;
		case 2:
			dayOfWeek = "月";
			break;
		case 3:
			dayOfWeek = "火";
			break;
		case 4:
			dayOfWeek = "水";
			break;
		case 5:
			dayOfWeek = "木";
			break;
		case 6:
			dayOfWeek = "金";
			break;
		default:
			dayOfWeek = "土";
			break;
		}
		System.out.println("今日は" + dayOfWeek + "曜日です");

	}

}
