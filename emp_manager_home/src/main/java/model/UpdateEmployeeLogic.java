package model;

import dao.EmployeesDAO;

public class UpdateEmployeeLogic {
	public boolean execute(Employee employee) {
		EmployeesDAO dao = new EmployeesDAO();
		return dao.update(employee);
	}
}
