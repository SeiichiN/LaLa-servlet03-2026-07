package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import model.CreateLogic;

import java.io.IOException;

@WebServlet("/CreateDoneServlet")
public class CreateDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String mail = request.getParameter("mail");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		Account account = new Account(userId, pass, mail, name, age);
		
		CreateLogic createLogic = new CreateLogic();
		String msg = null;
		if (createLogic.execute(account)) {
			msg = "登録完了しました";
		} else {
			msg = "登録に失敗しました";
		}
		
		request.setAttribute("msg", msg);
		String url = "WEB-INF/jsp/createDone.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
