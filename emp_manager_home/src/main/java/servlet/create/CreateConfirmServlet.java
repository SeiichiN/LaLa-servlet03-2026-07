package servlet.create;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import servlet.util.SetEmployee;
import servlet.util.Validate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CreateConfirmServlet")
public class CreateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetEmployee setEmployee = new SetEmployee();
		Employee employee = setEmployee.execute(request);
		List<String> errors = new ArrayList<String>();
		Validate validate = new Validate();
		validate.check(employee, errors, "create");
		
		request.setAttribute("emp", employee);
		if (errors.size() == 0) {
			request.getRequestDispatcher("WEB-INF/jsp/create/createConfirm.jsp").forward(request, response);
		} else {
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("WEB-INF/jsp/create/createInput.jsp").forward(request, response);
		}

	}

}
