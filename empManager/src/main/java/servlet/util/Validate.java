package servlet.util;

import java.util.List;
import java.util.regex.Pattern;

import model.Employee;

public class Validate {
	public void check(Employee emp, List<String> errors) {
		// idのチェック
		String id = emp.getId();
		if (id == null || id.length() == 0) {
			errors.add("IDが未入力です");
		} else {
			Pattern pattern = Pattern.compile("^EMP[0-9]{3}$");
			if (!pattern.matcher(id).matches()) {
				errors.add("IDが正しくありません");
			}
		}
		// 名前チェック
		String name = emp.getName();
		if (name == null || name.length() == 0) {
			errors.add("名前が未入力です");
		}
		// 年齢チェック
		int age = emp.getAge();
		if (age <= 0) {
			errors.add("年齢が正しくありません");
		}
		
	}
}
