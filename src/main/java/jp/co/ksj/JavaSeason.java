package jp.co.ksj;

public class JavaSeason {
	enum Season {
		SPRING, SUMMER, AUTUMN, WINTER
	};

	public static void main(String[] args) {

		for (Season season : Season.values()) {
			System.out.println(season.toString());

		}
	}

}
