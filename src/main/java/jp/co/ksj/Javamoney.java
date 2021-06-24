package jp.co.ksj;

public class Javamoney {
	private static final double TAX = 0.1;

	public static void main(String[] args) {

		int amount = (int) (1500 * (1 + TAX));
		System.out.println(amount + "円");
	}
}
