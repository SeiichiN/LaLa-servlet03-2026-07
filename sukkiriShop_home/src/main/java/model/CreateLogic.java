package model;

import dao.AccountsDAO;

public class CreateLogic {
	public boolean execute(Account account) {
		AccountsDAO dao = new AccountsDAO();
		return dao.create(account);
	}
}
