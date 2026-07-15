package servlet.util;

import java.util.List;

import model.Account;

public class Validate {
	public void check(Account account, List<String> errors) {
		if (isNull(account.getUserId())) {
			errors.add("ユーザーIDが未入力です");
		}
		if (isNull(account.getPass())) {
			errors.add("パスワードが未入力です");
		}
		if (isNull(account.getMail())) {
			errors.add("メールアドレスが未入力です");
		}
		if (isNull(account.getName())) {
			errors.add("名前が未入力です");
		}
		if (account.getAge() == 0) {
			errors.add("年齢が正しくありません");
		}
	}
	
	private boolean isNull(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}
}
