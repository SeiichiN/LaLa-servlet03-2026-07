package model;

import dao.EmployeesDAO;

public class NotExistIdLogic {
	public boolean execute(String id) {
		EmployeesDAO dao = new EmployeesDAO();
		return dao.notExistId(id);
	}
}
