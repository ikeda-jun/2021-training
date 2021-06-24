package jp.co.ksj;

public class Javaif {
	public static void main(String[] args) {
		int value = 0;
		if (value == 0) {
			System.out.println("値は0です");
		} else if (1 <= value && value <= 5) {
			System.out.println("値は1以上5以下です");

		} else {
			System.out.println("値は" + value + "です");

		}
	}

}
