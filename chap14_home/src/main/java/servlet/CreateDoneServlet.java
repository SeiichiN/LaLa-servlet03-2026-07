package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.Account;
import model.CreateLogic;

@WebServlet("/CreateDoneServlet")
public class CreateDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Account account = (Account) session.getAttribute("account");
		
		CreateLogic createLogic = new CreateLogic();
		String msg = null;
		if (createLogic.execute(account)) {
			msg = "登録完了しました";
		} else {
			msg = "登録に失敗しました";
		}
		session.removeAttribute("account");
		
		request.setAttribute("msg", msg);
		String url = "WEB-INF/jsp/createDone.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
