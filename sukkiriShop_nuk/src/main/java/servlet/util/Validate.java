package servlet.util;

import java.util.List;
import java.util.regex.Pattern;

import model.Account;

public class Validate {
	private final Pattern PTN_PASS = Pattern.compile("^[0-9]+$");
	private final Pattern PTN_MAIL = Pattern.compile("^.+@.+\\..+$");
	
	public void check(Account account, List<String> errors) {
		if (isNull(account.getUserId())) {
			errors.add("ユーザーIDが未入力です");
		}
		if (isNull(account.getPass())) {
			errors.add("パスワードが未入力です");
		} else if (!PTN_PASS.matcher(account.getPass()).matches()) {
			errors.add("パスワードの形式が不正です");
		}
		if (isNull(account.getMail())) {
			errors.add("メールアドレスが未入力です");
		} else if (!PTN_MAIL.matcher(account.getMail()).matches()) {
			errors.add("メールアドレスの形式が不正です");
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
