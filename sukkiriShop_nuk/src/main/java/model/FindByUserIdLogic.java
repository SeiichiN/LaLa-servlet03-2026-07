package model;

import dao.AccountsDAO;

public class FindByUserIdLogic {
	public Account execute(String userId) {
		AccountsDAO dao = new AccountsDAO();
		return dao.findByUserId(userId);
	}
}
