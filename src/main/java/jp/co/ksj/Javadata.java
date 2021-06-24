package jp.co.ksj;

import java.util.ArrayList;

public class Javadata {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄色");
		colors.add("オレンジ");
		colors.add("緑");
		colors.add("ピンク");
		colors.add("紫");

		System.out.println(colors.get(5));

		colors.remove(1);
		colors.add(2, "水色");

		System.out.println(colors.get(1));

		colors.set(6, "白");
		colors.add(0, "黒");

		System.out.println(colors.get(6));

	}

}