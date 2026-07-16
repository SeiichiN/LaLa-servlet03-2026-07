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

@WebServlet("/CreateConfirmServlet")
public class CreateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Account account = (Account) session.getAttribute("account");
		CreateLogic logic = new CreateLogic();
		boolean result = logic.execute(account);
		String msg = null;
		if (result) {
			msg = "登録しました";
		} else {
			msg = "登録できませんでした";
		}
		session.removeAttribute("account");
		
		request.setAttribute("msg", msg);
		String url = "WEB-INF/jsp_create/createDone.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
