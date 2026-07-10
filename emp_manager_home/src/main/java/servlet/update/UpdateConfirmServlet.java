package servlet.update;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Employee;
import servlet.util.SetEmployee;
import servlet.util.Validate;

@WebServlet("/UpdateConfirmServlet")
public class UpdateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetEmployee employee = new SetEmployee();
		Employee emp = employee.execute(request);
		List<String> errors = new ArrayList<String>();
		Validate validate = new Validate();
		validate.check(emp, errors);
		request.setAttribute("emp", emp);
		String url = null;
		if (errors.size() > 0) {
			url = "WEB-INF/jsp/update/updateInput.jsp";
			request.setAttribute("errors", errors);
		} else {
			url = "WEB-INF/jsp/update/updateConfirm.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
