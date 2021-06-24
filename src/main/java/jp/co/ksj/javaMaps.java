package jp.co.ksj;

import java.util.HashMap;

public class javaMaps {
	public static void main(String[] args) {
		HashMap<String, String> employees = new HashMap<>();
		employees.put("A001", "田中太郎");
		employees.put("A002", "佐藤次郎");
		employees.put("A003", "山田花子");
		employees.put("A004", "佐藤次郎");

		System.out.println(employees);

		employees.remove("A003");
		employees.put("A004", "佐藤次郎");

		System.out.println(employees);

	}

}
