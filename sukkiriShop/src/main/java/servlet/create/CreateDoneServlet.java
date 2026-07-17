package servlet.create;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Account account = (Account)session.getAttribute("account");
		CreateLogic logic = new CreateLogic();
		boolean result = logic.execute(account);
		String msg = null;
		if (result) {
			msg = "登録しました";
		} else {
			msg = "登録できませんでした";
		}
		request.setAttribute("msg", msg);
		if (session.getAttribute("account") != null) {
			session.removeAttribute("account");
		}
		String url = "WEB-INF/jsp_create/createDone.jsp";
		request.getRequestDispatcher(url)
		       .forward(request, response);
	}

}
