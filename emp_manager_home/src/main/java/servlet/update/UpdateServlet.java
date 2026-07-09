package servlet.update;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import model.FindByIdLogic;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		FindByIdLogic logic = new FindByIdLogic();
		Employee employee = logic.execute(id);
		request.setAttribute("emp", employee);
		String url = "WEB-INF/jsp/update/updateInput.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
