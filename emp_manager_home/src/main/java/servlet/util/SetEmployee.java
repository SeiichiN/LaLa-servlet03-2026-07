package servlet.util;

import jakarta.servlet.http.HttpServletRequest;
import model.Employee;

public class SetEmployee {
	public Employee execute(HttpServletRequest request) {
		String id = request.getParameter("id");
		id = id.toUpperCase();
		String name = request.getParameter("name");
		String ageTxt = request.getParameter("age");
		
		int age = 0;
		try {
			age = Integer.parseInt(ageTxt);
		} catch (NumberFormatException e) {
			age = -1;
		}
		Employee employee = new Employee(id, name, age);
		return employee;
	}
}
