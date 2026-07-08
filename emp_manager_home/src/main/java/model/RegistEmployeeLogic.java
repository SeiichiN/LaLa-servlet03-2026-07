package model;

import dao.EmployeesDAO;

public class RegistEmployeeLogic {
	public boolean execute(Employee employee) {
		EmployeesDAO dao = new EmployeesDAO();
		return dao.create(employee);
	}
}
