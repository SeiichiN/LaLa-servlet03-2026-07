package servlet.util;

import java.util.List;
import java.util.regex.Pattern;

import model.Employee;
import model.NotExistIdLogic;

public class Validate {
	public void check(Employee emp, List<String> errors, String mode) {
		Pattern pattern = Pattern.compile("^EMP[0-9]{3}$");
		if (emp.getId() == null || emp.getId().isEmpty()) {
			errors.add("IDを入力してください");
		} else if (!pattern.matcher(emp.getId()).matches()) {
			errors.add("IDの形式が正しくありません");
		} else {
			if (mode.equals("create")) {
			    // ID重複チェック
				NotExistIdLogic notExistIdLogic = new NotExistIdLogic();
				boolean notExist = notExistIdLogic.execute(emp.getId());
				if (notExist == false) {
				 	errors.add("IDが重複しています");
				}
			}
		}
		
		if (emp.getName() == null || emp.getName().isEmpty()) {
			errors.add("名前を入力してください");
		}
		
		if (emp.getAge() <= 0) {
			errors.add("年齢を数字で入力してください");
		}
	}
}
