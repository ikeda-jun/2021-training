package jp.co.ksj;

public class Javadowhile {
	public static void main(String[] args) {
		int x = 2;

		do {
			if (x % 2 <= 0) {
				System.out.println(x);
			}
			x += 1;
		} while (x < 10);
	}

}
