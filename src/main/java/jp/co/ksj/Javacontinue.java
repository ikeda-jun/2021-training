package jp.co.ksj;

public class Javacontinue {
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			if (x % 3 <= 0) {
				continue;
			}
			System.out.println(x);
		}
	}

}
