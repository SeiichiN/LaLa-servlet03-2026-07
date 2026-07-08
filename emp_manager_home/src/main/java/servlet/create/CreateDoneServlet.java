package servlet.create;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import model.RegistEmployeeLogic;
import servlet.util.SetEmployee;

import java.io.IOException;

@WebServlet("/CreateDoneServlet")
public class CreateDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SetEmployee setEmployee = new SetEmployee();
		Employee employee = setEmployee.execute(request);
		RegistEmployeeLogic registEmployeeLogic = new RegistEmployeeLogic();
		boolean result = registEmployeeLogic.execute(employee);
		String msg = null;
		if (result == true) {
			msg = "登録しました";
		} else {
			msg = "登録に失敗しました";
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("WEB-INF/jsp/create/createDone.jsp").forward(request, response);
		
	}

}
