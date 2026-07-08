package servlet.create;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import servlet.util.Validate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CreateConfirmServlet")
public class CreateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String ageTxt = request.getParameter("age");
		
		List<String> errors = new ArrayList<>();
		int age = 0;
		try {
			age = Integer.parseInt(ageTxt);
		} catch (NumberFormatException e) {
			errors.add("年齢を数字で入力してください");
		}
		Employee employee = new Employee(id, name, age);
		Validate validate = new Validate();
		validate.check(employee, errors);
		
		request.setAttribute("emp", employee);
		if (errors.size() == 0) {
			request.getRequestDispatcher("WEB-INF/jsp/create/createConfirm.jsp").forward(request, response);
		} else {
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("WEB-INF/jsp/create/createInput.jsp").forward(request, response);
		}

	}

}
