package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ReturnTopServlet")
public class ReturnTopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// セッションに account がもし残っていたら、
		// 削除してからトップに戻る
		HttpSession session = request.getSession();
		if (session.getAttribute("account") != null) {
			session.removeAttribute("account");
		}
		response.sendRedirect("WelcomeServlet");
	}

}
