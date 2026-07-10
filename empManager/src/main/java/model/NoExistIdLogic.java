package model;

import dao.EmployeesDAO;

public class NoExistIdLogic {
	public boolean execute(String id) {
		EmployeesDAO dao = new EmployeesDAO();
		return dao.NoExistId(id);
		// true -- そのIDは使われていない
	}
}
