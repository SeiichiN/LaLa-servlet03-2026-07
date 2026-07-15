package model;

import dao.AccountsDAO;

public class LoginLogic {
	public boolean execute(Login login) {
		AccountsDAO dao = new AccountsDAO();
		Account account = dao.findByLogin(login);
		if (account != null) { // userId,passは正しい
			return true;
		}
		return false;
	}
}
