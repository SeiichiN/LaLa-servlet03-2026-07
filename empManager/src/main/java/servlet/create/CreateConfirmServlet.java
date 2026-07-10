package servlet.create;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Employee;
import model.NoExistIdLogic;
import servlet.util.SetEmployee;
import servlet.util.Validate;

@WebServlet("/CreateConfirmServlet")
public class CreateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetEmployee setEmp = new SetEmployee();
		Employee emp = setEmp.set(request);
		
		List<String> errors = new ArrayList<>();
		Validate validate = new Validate();
		validate.check(emp, errors);
		
		NoExistIdLogic logic = new NoExistIdLogic();
		boolean result = logic.execute(emp.getId());
		if (result == false) {
			errors.add("そのIDは使えません");
		}
		String url = null;
		if (errors.size() > 0) {
			url = "WEB-INF/jsp/create/createEmp.jsp";
			request.setAttribute("errors", errors);
		} else {
			url = "WEB-INF/jsp/create/createConfirm.jsp";
		}
		request.setAttribute("emp", emp);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
