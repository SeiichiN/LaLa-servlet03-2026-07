package model;

import dao.EmployeesDAO;

public class FindByIdLogic {
	public Employee execute(String id) {
		EmployeesDAO dao = new EmployeesDAO();
		return dao.findById(id);
	}
}
