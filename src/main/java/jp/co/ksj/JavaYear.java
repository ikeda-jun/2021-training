package jp.co.ksj;

public class JavaYear {
	public static void main(String[] args) {
		String[] Jday = { "日", "月", "火", "水", "木", "金", "土" };
		String[] Eday = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		for (int x = 0; x < Jday.length; x++) {
			System.out.println(Jday[x] + "曜日は英語では" + Eday[x] + "です");

		}
	}
}
