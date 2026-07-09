package servlet.update;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import model.UpdateEmployeeLogic;
import servlet.util.SetEmployee;

@WebServlet("/UpdateDoneServlet")
public class UpdateDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee = new SetEmployee().execute(request);
		UpdateEmployeeLogic updateEmployeeLogic = new UpdateEmployeeLogic();
		boolean result = updateEmployeeLogic.execute(employee);
		String msg = null;
		if (result == true) {
			msg = "更新しました";
		} else {
			msg = "更新に失敗しました";
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("WEB-INF/jsp/update/updateDone.jsp").forward(request, response);
	}

}
